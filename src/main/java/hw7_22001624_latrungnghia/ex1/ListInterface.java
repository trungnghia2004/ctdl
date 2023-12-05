package hw7_22001624_latrungnghia.ex1;

public interface ListInterface<T> extends Iterable<T> {
    public void add(T data);
    public T get(int i);
    public void set(int i, T data);
    public boolean isContain(T data);
    public int size();
    public boolean isEmpty();
}
