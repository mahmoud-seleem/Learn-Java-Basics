package OOP.generics;

public class Being implements Comparable<Being>{
    int size;
    @Override
    public int compareTo(Being o) {
        if (this.size > o.size) return 1;
        else if (this.size < o.size) return -1;
        return 0;
    }
}
