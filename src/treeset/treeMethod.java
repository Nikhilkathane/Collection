package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class treeMethod {

    public static void main(String[] args) {

        TreeSet<Integer> n = new TreeSet<>();

        // Using the add() method
        n.add(2);
        n.add(4);
        n.add(6);
        n.add(10);
        n.add(12);



        System.out.println(n);


        //addAll() method
        //TreeSet<Integer> n1 = new TreeSet<>();
        //n.add(1);
        //n1.addAll(n);
        //System.out.println("New TreeSet: " + n1);

        /*Iterator<Integer> iterate = n.iterator();
        System.out.println("TreeSet using Iterator: ");
        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.println(", ");
        }*/

        //remove() method
        /*boolean result=n.remove(6);
        System.out.println(result);
        System.out.println(n);*/

        //removeAll() method
        /*boolean result=n.removeAll(n);
        System.out.println(result);
        System.out.println(n);*/

        //first() Method
        /*int result=n.first();
        System.out.println(result);*/

        //last() Method
        /*int result=n.last();
        System.out.println(result);*/

        /*System.out.println(n.higher(6));
        System.out.println(n.lower(6));


        System.out.println(n.ceiling(9));
        System.out.println(n.floor(3));*/

        /*System.out.println(n.pollFirst());
        System.out.println(n);

        System.out.println(n.pollLast());
        System.out.println(n);*/

        /*System.out.println(n.headSet(10,true));
        System.out.println(n);*/

        /*System.out.println(n.tailSet(10,true));
        System.out.println(n);*/

        /*System.out.println(n.subSet(4,10));
        System.out.println(n);*/






    }
}