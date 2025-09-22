package main.java.com.mkdevs.dyma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImmutableList<T> {

    private List<T> innerList;

    public ImmutableList(T ...elements) {
        this.innerList = Arrays.stream(elements).toList();
    }

    public Stream<T> stream() {
        return innerList.stream();
    }

    public T get(int index) {
        return innerList.get(index);
    }

}
