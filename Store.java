import java.util.*;
public class Store {
  public static void main (String[] args){
    Scanner input= new Scanner(System.in);
    int bookNumber;
    System.out.println("Number of books: ");
    bookNumber=input.nextInt();
    double bookCost;
    final double COSTPERBOOK=9.00;
    bookCost=bookNumber*9.00;
    double bookShipping;
    final double SHIPPINGBOOKCOST=0.95;
    bookShipping=bookCost*0.95;

    double peanutPounds;
    System.out.println("Pounds of peanuts: ");
    peanutPounds= input.nextDouble();
    double peanutCost;
    final double COSTPEANUT=1.72;
    peanutCost=peanutPounds*1.72;
    double peanutShipping;
    final double SHIPPINGPEANUT;
    peanutShipping=peanutPounds*0.30;

    int movieNumber;
    System.out.println("Number of movies: ");
    movieNumber=input.nextInt();
    double movieCost;
    final double COSTMOVIE=13.97;
    movieCost=movieNumber*13.97;
    double movieShipping;
    movieShipping=movieCost*0.04;
    ////////////////////////////////////////
    System.out.println("Steve's S-Mart");
    System.out.println("Served by: Roxie");
    int dateMonth;
    dateMonth= (int) (Math.random()*12+1);
    int dateDay;
    dateDay= (int)(Math.random ()*28 +1);
    timeHour= (int)(Math.random()*24);

    System.out.println("Date:"+ dateMonth  "Time:");
    
    double taxes;
    taxes=0.072*(movieCost+bookCost);
    double totalShipping;
    totalShipping=movieShipping+bookShipping+peanutShipping;
    System.out.println("Shipping" + totalShipping);
    double grandTotal;
    grandTotal= movieCost+bookCost+peanutCost+totalShipping+taxes;
    System.out.println("Grand Total" + grandTotal);
}







}
