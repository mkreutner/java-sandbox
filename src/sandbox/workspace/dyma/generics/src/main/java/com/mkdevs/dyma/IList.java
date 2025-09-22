
package main.java.com.mkdevs.dyma;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

// Make sure you have a Person class in the same package or import it if it's elsewhere
public class IList<T extends Person> {

    private List<T> innerList;

    public IList(T ... elements) {
        this.innerList = Arrays.stream(elements).toList();
    }

    public Stream<T> stream() {
        return innerList.stream();
    }
}
