
import java.util.Scanner;

public class Average{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); //this makes a scanner object
    System.out.println("Enter three integer values:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    double avg = ((num1 + num2 + num3)/3);
    System.out.println("The average of the three numbers is: " + avg);
  }
}
