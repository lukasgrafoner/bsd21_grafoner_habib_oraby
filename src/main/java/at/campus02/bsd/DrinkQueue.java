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

public class DrinkQueue implements IDQueue{

    private List<Object> elements = new ArrayList<Object>();
    private int max = 5;

    @Override
    public boolean offer(Object drink) {
        if (elements.size() != max)
            elements.add(drink);
        else
            return false;

        return true;
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
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
