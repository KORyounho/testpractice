package typeparameter.List;

import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface List<E> extends Collection<E>, Iterable<E> {
    public boolean contain(E e);
    public void print();
    default Stream<E> stream(){
        return StreamSupport.stream(spliterator(), false);
    }

}
