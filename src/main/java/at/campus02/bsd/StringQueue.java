package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }

  /**
   * add object to queue
   * @param obj
   * @return returns true if adding works
   */
  @Override
  public boolean offer(String obj) {
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
  public String poll() {
    String element = peek();

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
  public String remove() {
    String element = poll();
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
  public String peek() {
    String element;
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
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}