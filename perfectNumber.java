import java.util.Scanner;
class perfectNumber {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int sum=0;
    for(int i=1;i<num;i++){
      if(num%i==0){
      sum=sum+i;
        System.out.println(i);
      }
  }
     if(sum==num){
      System.out.println("It's a perfect number.");
      }
     else{
      System.out.println("It's not a perfect number."); 
      }
    }
}