package solutions.generic.warehouse_exe.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Crate<T> {
    private final List<T> contents = new ArrayList<>();

    public void add(T item) {
        contents.add(item);
    }

    public List<T> getContents() {
        return Collections.unmodifiableList(contents);
    }

    @Override
    public String toString() {
        return contents.toString();
    }
}
