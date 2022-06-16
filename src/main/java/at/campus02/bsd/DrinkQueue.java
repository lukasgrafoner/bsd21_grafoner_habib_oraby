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

    /**
     * add object to queue
     * @param drink
     * @return returns true if adding works
     */
    @Override
    public boolean offer(Object drink) {
        if (elements.size() != max)
            elements.add(drink);
        else
            return false;

        return true;
    }

    /**
     * @return first element
     * delete first element
     */

    @Override
    public Object poll() {
        Object element = peek();

        if (elements.size() != 0) {
            elements.remove(element);
        }
        return element;
    }

    /**
     * @return first element
     * @exception throws NoSuchElementException if element doesn't exist
     */

    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * method to get the first element
     * if element-list empty, return null
     * @return first element or null
     */
    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * method to get the first element
     * @return first element
     * @throws NoSuchElementException if there is no element
     */
    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
