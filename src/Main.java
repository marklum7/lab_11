import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        product screen = new screen(in.next(), in.nextDouble(), in.nextDouble());
        product mouse = new mouse(in.next(), in.nextDouble(), in.nextDouble());
        product keyboard = new keyboard(in.next(), in.nextDouble(), in.nextDouble());

         user partner = new partner(in.next(),in.next());
         user client = new client(in.next(),in.next());
         user shareholder = new shareholder(in.next(),in.next());

         Buy Buys = new Buy(in.next(),in.nextDouble(),in.nextDouble(),in.next(),in.next());
         Buys.buy();
    }
}