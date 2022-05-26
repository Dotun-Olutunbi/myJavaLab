package AbstractClassChallenge;

import java.util.LinkedList;
import java.util.List;

public class Lab {
    private List store = new LinkedList<>();
    //that is any ListItem object can hold reference to other objects on its right and left
    private ListItem rightLink = null;
    private ListItem leftLink = null;
    //note that the private access modifier is not accessible outside the class

    //since we don't know the type of the value beforehand
    protected Object value;

    //compares the object with the "itemToBeCompared" parameter
    // 0- if equal
    // -ve - if itemToBeCompared is swapped before the object, else +ve.
    //the above returns an integer -ve or +ve;

    public Lab(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
