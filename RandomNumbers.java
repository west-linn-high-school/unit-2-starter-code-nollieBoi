import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args){
    Random rand = new Random();
    int num;
    double val;

    num = rand.nextInt(10);
    System.out.println("# [0,9]: " + num);
    num = rand.nextInt(10) + 1;
    System.out.println("# [1,10]: " + num);
    num = rand.nextInt(15) + 20;
    System.out.println("# [20,34]: " + num);
    num = rand.nextInt(20) - 10;
    System.out.println("# [-10,9]: " + num);
    val = rand.nextDouble();
    System.out.println("# [0,10): " + val);
    val = rand.nextDouble() * 6;
    System.out.println("# [0,6): " + val);

    num = (int)(Math.random() * 10);
    System.out.println("# [0,9]: " + num);
    num = (int)((Math.random() * 10) + 1);
    System.out.println("# [1,10]: " + num);
    num = (int)((Math.random() * 15) + 20);
    System.out.println("# [20,34]: " + num);
    num = (int)((Math.random() * 20) - 10);
    System.out.println("# [-10,9]: " + num);

  }
}
