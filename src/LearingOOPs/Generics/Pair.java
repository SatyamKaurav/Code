package LearingOOPs.Generics;

public class Pair<T> {
private  T first;
private T Second;

    public Pair(T first, T second) {
    this.first=first;
    this.Second=second;

    }

    public Pair(T second) {

        Second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return Second;
    }

    public void setSecond(T second) {
        Second = second;
    }
}
