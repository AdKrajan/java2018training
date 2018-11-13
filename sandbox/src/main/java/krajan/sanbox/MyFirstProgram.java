package krajan.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) { //test
        hello("world");
        hello("Adam");
        hello("User");

        Square s = new Square(5);
        System.out.println("Powierzchnia kwadratu " + s.l + " = " + s.areakw());

        Rectangle r = new Rectangle(50, 60);
        System.out.println("Powierzchnia prostokata " + r.a + " i " + r.b + " = " + r.areapr());
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }



}