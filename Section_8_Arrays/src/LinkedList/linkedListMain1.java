package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListMain1 {
    public static void main(String[] args) {
        LinkedList<Double> e = new LinkedList<>();
        e.add(22.0);
        e.add(33.2);
        e.add(20.3);
        printList(e);
        System.out.println("----------------------");
        addInOrder(e, 302.4);
        addInOrder(e, 32.4);
        addInOrder(e, 21.4);
        printList(e);
        System.out.println("===============");
        addInOrder(e, 21.4);
    }

    public static void printList(LinkedList<Double> listX){
        Iterator<Double> p = listX.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }

    public static boolean addInOrder(LinkedList<Double> linkedListOne, double newEntry){
        ListIterator<Double> listIterator = linkedListOne.listIterator();
        while(listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newEntry);
            if(comparison==0){
                System.out.println("New entry is the same as entry in linkedlistOne");
                linkedListOne.add(newEntry);
                return false;
            }else if(comparison>0){
                //by default, in comparison, the already existing has a bigger value than the new entry. A +ve subtraction means the new entry should come first.
                listIterator.previous();
                listIterator.add(newEntry);
                return true;
            }else{
                //move on to the next member
            }
        }
        linkedListOne.add(newEntry);
        return true;
    }
}
