package at.campus02.bsd;

public interface IDoubleQueue {
    /*
  add object to queue, return true if works, otherwise false
  */
    public abstract boolean offer(double obj);

    /*
    returns and deletes first element; null if no element in there
     */
    public abstract double poll();

    /*
    like poll but if no elment exists NoSuchElementException is throwin instead of null return value
     */
    public abstract double remove();

    /*
    gives first element but does not delete, null if nothing there
     */
    public abstract double peek();

    /*
    like peek but NoSuchElementException instead of null
     */
    public abstract double element();
}
