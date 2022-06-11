import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("How old are you?");
    int age=s.nextInt();
    System.out.println("Are you male(M) or female(F)?");
    String gender=s.next();
    System.out.println("Are you married(Y or N)?");
    String ms=s.next();
    if (gender.equals("F")){
      System.out.println("You will work in urban areas.");
    }
    else if ((gender.equals("M"))&&(20<age&&age<40)){
     System.out.println("You may work anywhere."); 
    }
    else if ((gender.equals("M"))&&(40<age&&age<60)){
      System.out.println("You will only work in urban areas.");
    }
    else{
      System.out.println("ERROR");
    }
  }
}