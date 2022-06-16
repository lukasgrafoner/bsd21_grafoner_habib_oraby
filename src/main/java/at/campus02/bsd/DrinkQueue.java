package at.campus02.bsd;

public class DrinkQueue implements IQueue{
    
    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
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
