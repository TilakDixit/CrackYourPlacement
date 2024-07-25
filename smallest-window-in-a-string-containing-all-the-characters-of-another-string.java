class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        String ans="";
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c=0;
        int dc=p.length();
        HashMap<Character,Integer>map1=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true){
            boolean f1=false;
            boolean f2 =false;
            //acquire
            
            while(i<s.length()-1&&c<dc){
                i++;
                char ch=s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0)<=map.getOrDefault(ch,0)){
                    c++;
                }
                f1=true;
                
            }
            
            
            //collect and reslease
            while(j<i&&c==dc){
                String pans=s.substring(j+1,i+1);
                if(ans.length()==0||pans.length()<ans.length()){
                    ans=pans;
                    
                    
                }
                j++;
                char ch=s.charAt(j);
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                if(map1.getOrDefault(ch,0)<map.getOrDefault(ch,0)){
                    c--;
                }
                f2=true;
                
            }
            if(f1==false&&f2==false){
                break;
            }
        }
        
        return ans.length()==0?"-1":ans;
    }
}
