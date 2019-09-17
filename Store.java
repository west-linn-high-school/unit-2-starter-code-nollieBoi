java.util.*;
public class Store {
  public static void main (String[] args);
  Scanner input= new Scanner(System.in);
  int bookNumber;
  System.out.println("Number of books: ");
  bookNumber=input.nextInt();
  double bookCost;
  final COSTPERBOOK=9.00;
  bookCost=bookNumber*9.00;
  double bookShipping;
  final SHIPPINGBOOKCOST=0.95;
  bookShipping=bookCost*0.95;

  int peanutPounds;
  System.out.println("Pounds of Peanuts: ");
  peanutPounds= input.nextDouble();
  double peanutCost;
  final COSTPEANUT=1.72;
  peanutCost=peanutPounds*1.72;
  double peanutShipping;
  final SHIPPINGPEANUT;
  peanutShipping=peanutPounds*0.30;







}
