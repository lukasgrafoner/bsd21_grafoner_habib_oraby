package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue implements IDoubleQueue{

    private List<Double> elements = new ArrayList<Double>();
    private int maxSize = 5;

    public DoubleQueue(int maxsize) {
        maxSize = maxSize;
    }

    /**
     * add object to queue
     * @param obj
     * @return returns true if adding works
     */
    @Override
    public boolean offer(double obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * @return first element
     * delete first element
     */
    @Override
    public double poll() {
        double element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * @return first element
     * @exception throws NoSuchElementException if element doesn't exist
     */
    @Override
    public double remove() {
        double element = poll();
        if (element == 0)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
    /**
     * method to get the first element
     * if element-list empty, return -1
     * @return first element or null
     */
    @Override
    public double peek() {
        double element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = -1;

        return element;
    }
    /**
     * method to get the first element
     * @return first element
     * @throws NoSuchElementException if there is no element
     */
    @Override
    public double element() {
        double element = peek();
        if (element == -1)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
