package OOP.generics;

public class Creature implements Comparable<Creature> {
    public int age;
    @Override
    public int compareTo(Creature o) {
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }
}
