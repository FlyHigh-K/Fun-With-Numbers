import java.util.Scanner;
class salary {
  public static void main(String[] args) {
    System.out.println("How many years have you worked for?");
    Scanner s=new Scanner(System.in);
    double years=s.nextInt();
    System.out.println("What is your salary?");
    double salary=s.nextInt();
    double bonus=(0.05*salary);
    if(years>=5){
    System.out.println(bonus+" This is your bonus.");    
    }
    else{
    System.out.println("You don't get a bonus.");  
    }
  }
}