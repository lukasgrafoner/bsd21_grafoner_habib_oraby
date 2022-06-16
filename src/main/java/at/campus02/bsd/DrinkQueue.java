/**
 * DrinkQueue class
 * @author Omar Oraby
 * @author Lukas Grafoner
 * @author Kyrillos Habib
 */
package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{

    private List<Object> elements = new ArrayList<Object>();
    private int max = 5;

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public Object poll() {
        Object element = peek();

        if (elements.size() != 0) {
            elements.remove(element);
        }
        return element;
    }

    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public String peek() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }
}
