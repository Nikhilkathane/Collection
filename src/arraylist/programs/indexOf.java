package arraylist.programs;

import java.util.ArrayList;

public class indexOf {
    public static void main(String[] args)
    {


        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(30);

        for (Integer number : arrlist)
        {
            System.out.println("Number = " + number);
        }

        int pos =arrlist.indexOf(30);

        System.out.println("\nThe element 3 is at index : " +pos);

        int lastpos =arrlist.indexOf(25);

        System.out.println("\nLast index of : " +lastpos);


    }

}
