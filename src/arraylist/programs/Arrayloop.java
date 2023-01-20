package arraylist.programs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Arrayloop {

    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("nikhil");
        //list.myAdd(44);
       // System.out.println(list);
        //list.set(2,"niks");
        //list.remove(0);
        //Collections.shuffle(list);
        //Collections.sort(list);
        //String n=list.get(1);
        //Collections.reverse(list);

        //String n=list.clone();

        //list.subList(0,2);

        ArrayList<String> list1=new ArrayList<>();


        list.equals(list1);
        System.out.println(list);


        /*for (int i=0;i<list.size();i++)
{
    System.out.println(list.get(i));
}

        int i=0;
        while (i<list.size())
        {
            System.out.println(list.get(i));
            i++;
        }


        for(String data:list)
        {
            System.out.println(data);
        }

        /*Iterator<String> niks= new Iterator() {
            @Override
            public Object next() {
                return null;
            }
        };*/




           }
}
