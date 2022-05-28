import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter mark.");
    Scanner s=new Scanner(System.in);
    int mark=s.nextInt();  
      if (mark<25){
        System.out.println("Grade F");
      }
      else if(mark<=45&&mark>25){
        System.out.println("Grade E");
      }
      else if(mark<=50&&mark>45){
        System.out.println("Grade D");
      }
      else if(mark<=60&&mark>50){
        System.out.println("Grade C");
      }
      else if(mark<=80&&mark>60){
        System.out.println("Grade B");
      }
      else{
        System.out.println("Grade A");
      }
  }
}