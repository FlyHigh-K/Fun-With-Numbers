import java.util.Scanner;
class Attendance {
  public static void main(String[] args) {
    System.out.println("How many classes were held?");
    Scanner s= new Scanner(System.in);
    double classes=s.nextInt();
    System.out.println("How many classes were attended?");
    double attended=s.nextInt();
    double percentage=(attended/classes)*100;
    System.out.println(percentage+"%");
    if(percentage>75){
      System.out.println("They can sit the exam.");
    }
    else{
      System.out.println("They can't sit the exam.");
    }
  }
}