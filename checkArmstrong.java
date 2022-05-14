import java.util.Scanner;
  class checkArmstrong {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num= s.nextInt();
    int num2=num;
    int sum=0;
    while(num>0){
      int remainder=num%10;
      System.out.println(remainder);
      sum=sum+remainder*remainder*remainder;
      num=num/10;
    }
    System.out.println(sum);
    if (sum==num2){
      System.out.println("It's an armstrong number.");
    }
    else{
      System.out.println("It's not an armstrong number.");
    }
  }
}