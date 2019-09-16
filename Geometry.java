public class Geometry{
        public static void main(String[] args){
            int sides = 7;
            int radius = 5;
            final double PI = 22/7;
            int num = 7658;
            int num2 = num/100;
            int num3 = num2/10;
            System.out.println(num - num3 * 1000);
            System.out.println("A heptagon has " + sides + " sides.");
            sides = 10;
            System.out.println("A decagon has " + sides + " sides.");
            sides = 12;
            System.out.println("A dodecagon has " + sides + " sides.");
            System.out.println("epic win!!");
            System.out.println("The circumference of a circle with a radius of " + radius + " is " + (PI * (radius * 2)) + ".");
        }
}
