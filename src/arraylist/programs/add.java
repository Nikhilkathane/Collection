package arraylist.programs;
import java.util.ArrayList;


public class add {
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
    }
}

