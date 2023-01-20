package arraylist.programs.hashSet;

public class MyClass {
    public static void main( String[] args )
    {
        Node node=new Node();
        System.out.println(node.hashCode());

        String s = "abc";
        System.out.println(s.hashCode());

        Kalidas kalidas = new Kalidas();
        kalidas.add(10);
        kalidas.add(35);
        kalidas.add(46);
        kalidas.add(69);
        kalidas.add(17);
        kalidas.add(51);
        kalidas.add(11);
        kalidas.add(54);

        System.out.println(kalidas.contains(25));
    }

}
