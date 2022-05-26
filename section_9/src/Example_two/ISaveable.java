package Example_two;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    public List<String> write();
    //this "write() takes the state of an object and writes it in a list it returns
    void read(List<String> savedValues);
    //not that the read returns nothing, but reads a generic list

}
