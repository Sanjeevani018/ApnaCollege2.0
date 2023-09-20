public class JavaBasics{

  public static void i_HalfPyramid_withNum(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i+1;j++){
        System.out.print(j);
      }System.out.println();
    }
    }
  
      public static void main(String args[]){
        i_HalfPyramid_withNum(6);
      }
}
