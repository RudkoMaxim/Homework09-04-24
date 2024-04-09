package Equals;

public class Main extends Equals {
    protected Main(String card, int balance, int number) {
        super(card, balance, number);
    }

    public static void main(String[] args) {
        Equals card1 = new Equals("VISA", 3000,1234);
        Equals card2 = new Equals("MasterCard", 1000,1235);
        System.out.println(card1.equals(card2));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());
    }
}