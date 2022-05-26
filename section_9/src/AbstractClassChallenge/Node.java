package AbstractClassChallenge;

public class Node extends ListItem{
    //this is a concrete class based on the abstract class
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
        //check the access modifier in the tute
    }

    @Override
    ListItem previous() {
        return this.leftlink;
    }

    @Override
    ListItem setNext(ListItem nextItem) {
        this.rightLink = nextItem;
        return this.rightLink;
    }

    @Override
    ListItem setPrevious(ListItem previousItem) {
        this.leftlink = previousItem;
        return this.leftlink;
    }

    @Override
    int compareItem(ListItem itemToBeCompared) {
        if(itemToBeCompared != null){
            return ((String)super.getValue()).compareTo((String)itemToBeCompared.getValue());
        }else{
            return -1;
        }
    }
}
