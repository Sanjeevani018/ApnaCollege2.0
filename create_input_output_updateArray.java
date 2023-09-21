import java.util.*;
public class ArraysCC{
    public static void main(String args[]){
        int marks[]=new int[50];  //create an array
        System.out.println("length of an array :"+marks.length);
        Scanner sc=new Scanner(System.in);//input an array
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy : "+ marks[0]);//output of array
        System.out.println("Chem: "+ marks[1]);
        System.out.println("Maths : "+ marks[2]);

        //update
        marks[2]=100;
        System.out.println("Maths : "+ marks[2]);
        //Calculations
        int percent=(marks[0] +marks[1]+marks[2])  / 3;
        System.out.println(percent+"%");
     }
}
