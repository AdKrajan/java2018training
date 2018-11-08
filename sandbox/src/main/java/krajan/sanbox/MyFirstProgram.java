package krajan.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Adam");
        hello("User");

        double l = 5;
        System.out.println("Powierzchnia kwadratu " + l + " = " + areakw(l));

        double a = 4;
        double b = 6;
        System.out.println("Powierzchnia prostokata " + a + " i " + b + " = " + areapr(a, b));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
    public static double areakw(double len){
       return  len * len;
    }
    public static double areapr(double a, double b){
        return a * b;
    }


}