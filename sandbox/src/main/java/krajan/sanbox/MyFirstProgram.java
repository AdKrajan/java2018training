package krajan.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Adam");
        hello("User");

        Square s = new Square(5);
        System.out.println("Powierzchnia kwadratu " + s.l + " = " + areakw(s));

        Rectangle r = new Rectangle(50, 60);
        System.out.println("Powierzchnia prostokata " + r.a + " i " + r.b + " = " + areapr(r));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
    public static double areakw(Square s){
       return  s.l * s.l;
    }
    public static double areapr(Rectangle r){
        return r.a * r.b;
    }


}