package AbstractClassChallenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public abstract class ListItem {
    //An abstract class, to implement a concrete class.
    private List store = new LinkedList<>();
    //that is any ListItem object can hold reference to other objects on its right and left
    protected ListItem rightLink = null;
    protected ListItem leftlink = null;
    //note that the private access modifier is not accessible outside the class

    //since we don't know the type of the value beforehand
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();//sets reference to the next item in the list
    abstract ListItem previous();
    abstract ListItem setNext(ListItem nextItem); //sets reference to the next item to refer to in the list
    abstract ListItem setPrevious(ListItem previousItem);

    abstract int compareItem(ListItem itemToBeCompared);
    //compares the object with the "itemToBeCompared" parameter
    // 0- if equal
    // -ve - if itemToBeCompared is swapped before the object, else +ve.
    //the above returns an integer -ve or +ve;

    public Object getValue() {
        return value;
    }
}
