package krajan.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println(2+2);
        System.out.println(2*2);
        System.out.println(1.0 / 2);
        System.out.println("Adam" + " Krajan"); //łączenie stringów konkatenacja
        System.out.println(2+2*2);

        String somebody = "Powierzchnia kwadratu";
        int l = 6;  //deklaracja zmiennej
        double d = 12; //zmiennoprzecinkowy
        int s = l*l; //dzialanie na powierzchnie
        System.out.println(somebody + " " + l + " = " + s + " " + d);

    }

}