package generic.test.ex1;

public class Container<T> {

    private T value;


    public  boolean isEmpty() {
        return value == null;
    }

    public T getItem(T item) {
        return item;
    }

    public void setItem(T item) {
        this.value = item;
    }

}
