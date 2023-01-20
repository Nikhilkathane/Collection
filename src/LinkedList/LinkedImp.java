package LinkedList;

public class LinkedImp {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
       // boolean isContain=ll.contains(44);
        //System.out.println(isContain);
        //int result=ll.get(2);
        //System.out.println(result);
        //int result=ll.set(2,100);
       // System.out.println(ll.set(0,100));
        //ll.remove(3);
        ll.addAt(0,100);

        System.out.println(ll);
    }
}
       class Node<T>
       {
          T data;
           Node<T> next;

            Node(T data)
            {

                this.data = data;
    }
}
class MyLinkedList<T> {
    Node<T> head;


    //add method
    public void add(T data)
    {
        Node<T> obj = new Node<T>(data);
        if (head == null)
            head = obj;
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = obj;
        }

    }
//toString method

    public String toString()
    {
        String s = "[";
        Node<T> temp = head;
        while (temp != null)
        {
            if (temp.next != null)
                s += temp.data + ", ";
            else
                s += temp.data;
            temp = temp.next;

        }
        s += "]";
        return s;
    }
//contains method
  /* public boolean contains(T data) {


       //Node<T> obj=new Node<T>(data);

       Node<T> temp = head;
       while (temp!=null) {
           if (temp.data == data)
               return true;
           temp = temp.next;

       }
           return false;
       }*/

// get method

    /*public int get(int index1)
    {
        if(index1<0)
            throw new ArrayIndexOutOfBoundsException();
        Node temp=head;
        int index=0;
        while (temp!=null)
        {
            if(index==index1)
                return (int) temp.data;
            index++;
            temp=temp.next;
        }
        throw new ArrayIndexOutOfBoundsException();
    }*/

    /*public void set(T data,int index1) {
        if (index1 < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node temp = head;
        int index = 0;
        while (temp != null)
        {

            if (index == index1)
            {

              temp.data = data;
                return;
            }
            index++;
            temp = temp.next;
        }
        throw new ArrayIndexOutOfBoundsException();

    }*/


   // remove method

   /* public void remove(int index1)
    {
        if(index1<0)
            throw new ArrayIndexOutOfBoundsException();
        if(index1==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        int index=0;
        while(temp.next!=null) {
            if (index == index1-1)
            {
                temp.next=temp.next.next;
                return;
            }
            index++;
            temp=temp.next;
        }
        throw new ArrayIndexOutOfBoundsException();


    }*/

//addAt method

    public void addAt(int index1, T data)
    {
        Node obj=new Node(data);
        if(index1<0)
            throw new ArrayIndexOutOfBoundsException();
        if(index1==0)
        {
            obj.next=head;
            head=obj;
            return;
        }
        Node temp=head;
        int index=0;
        while (temp!=null) {
            if (index == index1 - 1)
            {
                obj.next=temp.next;
                temp.next=obj;
                return;
            }
            index++;
            temp=temp.next;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}





