package Equals;

public class Equals {
    private final String card;
    private final int balance;
    private final int number;
    protected Equals(String card, int balance, int number) {
        this.card = card;
        this.balance = balance;
        this.number = number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals equals = (Equals) o;
        return balance == equals.balance;
    }

    @Override
    public int hashCode() {
        int result = card == null ? 0 : card.hashCode();
        result = 31 * result + balance;
        result = 31 * result + number;
        return result;
    }
}
