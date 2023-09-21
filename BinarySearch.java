import java.util.*;
public class ArraysCC{
        public static int binarySearch(int numbers[],int key){
                int start=0;int end=numbers.length-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(numbers[mid]==key){
                        return mid;
                    }
                    if(numbers[mid]<key){
                        start=mid+1;
                    }else{
                        end=mid-1;  
                    }

                }
        return -1;
    }
    public static void main(String args[]){
            int numbers[]={2,4,6,8,10,12,14};
            int key =2;
            System.out.print("index for key is :"+ binarySearch(numbers, key));
     }
}
