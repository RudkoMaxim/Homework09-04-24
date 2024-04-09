package ToStringEqualsHashcode;

import java.util.Objects;

public class Musician{
    private String instrument;
    private int number;
    static int count;
    public static void printCount(){
        System.out.println(count);
    }
    public Musician(String instrument, int number){
        this.instrument = instrument;
        this.number = number;
        count++;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return number == musician.number && Objects.equals(instrument, musician.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrument, number);
    }
        @Override
    public String toString() {
        return "Instrument " + instrument + " Number " + number + "\n";
    }
}
