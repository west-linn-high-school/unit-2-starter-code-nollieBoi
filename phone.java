import java.util.Random;

public class phone{
  public static void main(String[] args){
    Random rand = new Random();
    int area1;
    int area2;
    int area3;
    int exchange1;
    int exchange;
    int finalFour;

    //AREA CODE
    area1 = rand.nextInt(8) + 2;
    area2 = rand.nextInt(9);
    area3 = rand.nextInt(10);
    String areaCode = new String("(" + area1 + area2 + area3 + ")");

    //EXCHANGE NUMBER
    exchange1 = rand.nextInt(8) + 2;
    exchange = rand.nextInt(90) + 10;
    String exchangeNum = new String("" + exchange1 + exchange);

    //FINAL FOUR DIGITS
    finalFour = rand.nextInt(9000) + 1000;
    String finalNum = new String("-" + finalFour);

    //PHONE NUMBER
    String phoneNum = new String(areaCode + exchangeNum + finalNum);
    System.out.println(phoneNum);
  }
}
