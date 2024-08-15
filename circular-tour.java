class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	 int n = petrol.length;
        
        int totalPetrol = 0;
        int currentPetrol = 0;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            int netPetrol = petrol[i] - distance[i];
            totalPetrol += netPetrol;
            currentPetrol += netPetrol;
            
            // If current petrol is negative, reset the start point
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }
        
        // If total petrol is non-negative, return the start index; otherwise, return -1
        return totalPetrol >= 0 ? start : -1;
    }
}
