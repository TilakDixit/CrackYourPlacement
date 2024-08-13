
class worker{
    double basepay;
    int quality;
    public worker(double basepay ,int quality){
        this.basepay=basepay;
        this.quality=quality;

    }
}
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        if(k==0){
            return 0;
        }
        ArrayList<worker>list=new ArrayList<>();
        int n=quality.length;
        for(int i=0;i<n;i++){
            double basepay=1.0*wage[i]/quality[i];
            list.add(new worker(basepay,quality[i]));
        }
        Collections.sort(list,new Comparator<worker>(){
            public int compare(worker w1,worker w2){
                if(w1.basepay<=w2.basepay){
                    return -1;
                }else{
                    return  1;
                }
            }
        });
        
        PriorityQueue<worker> pq = new PriorityQueue<>(new Comparator<worker>(){
            public int compare(worker w1,worker w2){
                if(w1.quality<=w2.quality){
                    return 1;
                }else{
                    return  -1;
                }
            }
        });
        double ans=Double.MAX_VALUE;
        int totalq=0;
        for(int i=0;i<n;i++){
            pq.offer(list.get(i));
            totalq+=list.get(i).quality;
            if(pq.size()==k){
                double cost=totalq*list.get(i).basepay;
                ans=Math.min(ans,cost);
                totalq-=pq.poll().quality;
            }
        }
        

return ans;


        
    }
}
