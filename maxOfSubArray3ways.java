//Brute Force


public class ArraysCC{
      public static void maxOfSubarry(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for (int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                  currSum+=numbers[k];
                  
              }System.out.println(currSum);
              if(maxSum<currSum){
                maxSum=currSum;
              }
              
            }
        }System.out.println("Max sum ="+maxSum);
      }
                   
    public static void main(String args[]){
            int numbers[]={2,4,6,8,10};

   maxOfSubarry(numbers);
}
}
----------------------------------------------------------------------------------------------------------------------------------------------------------
      //Prefix Array
      public class ArraysCC{
      public static void maxOfSubarry(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] =new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ numbers[i];
        }

        
        for (int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum = start== 0 ? prefix[end] : prefix[end]-prefix[start-1];
             }
             
              if(maxSum<currSum){
                maxSum=currSum;
              }
        }  System.out.println("Max sum =" + maxSum);
      }
                
    public static void main(String args[]){
            int numbers[]={1,-2,6,-1,3};

   maxOfSubarry(numbers);
}
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
