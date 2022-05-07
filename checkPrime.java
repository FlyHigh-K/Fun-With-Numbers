import java.util.Scanner;
import java.lang.Math;
class checkPrime {
  public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
    int x=s.nextInt();
    boolean p=true;
    for(int i=2;i<Math.sqrt(x);i++){
      if(x%i==0){
        p=false;
      }
    }
    if (p==true){
      System.out.println("It's a prime number.");
        }
      else{
       System.out.println("It isn't a prime number.");
    }
  }
}