/**
 * DrinkQueue class
 * @author Omar Oraby
 * @author Lukas Grafoner
 * @author Kyrillos Habib
 */
package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

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
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
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
