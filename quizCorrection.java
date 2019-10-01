import java.util.Scanner;
import java.util.Random;

public class quizCorrection{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int num;
    int randNum;
    int total;
    System.out.println("Enter a numer between 1-100");
    num = scan.nextInt();
    randNum = rand.nextInt(100) + 1;
    total = Math.abs(num - randNum);
    System.out.println("Your lucky number is: " + total);
  }
}
