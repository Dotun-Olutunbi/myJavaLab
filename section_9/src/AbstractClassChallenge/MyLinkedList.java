package AbstractClassChallenge;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //the list is empty, so the listItem becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareItem(newItem));
            if(comparison <0){
                //currentItem = 550, newItem = 777; comparison < 0
                //That is, if new item is greater, then we need to move right if possible
                if(currentItem.next()!= null){
                    //moving right to get a new currentItem
                    currentItem = currentItem.next();
                }else{
                    //there is no next, simply insert at the right end of the list
                    //swapping positions
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less,
                if(currentItem.previous() != null){
                    //that is, there exists a previous item and it is not null
                    //going to the left
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    //basically placing the new item before the current item
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    //node without the previous is the root, no previous
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //they are equal, no duplicates
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false; //just to fulfil the method.
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
