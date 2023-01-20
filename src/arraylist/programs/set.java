package arraylist.programs;
import java.util.ArrayList;


public class set {
    public static void main(String args[])
    {
        // Create an array list
        ArrayList<String> al = new ArrayList<String>();
        // Add elements to the array list
        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        System.out.println("ArrayList before set operation:"+al);

        al.set(1,"Kiwi");
        System.out.println("ArrayList after set operation:"+al);
    }
}
