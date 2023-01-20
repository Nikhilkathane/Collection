package arraylist.programs;

public class MyClass
{
    //StartOfMainMethod
    public static void main(String[] args)
    {
        MyArrayList<Integer> list=new MyArrayList<>();
        list.myAdd(11);
        list.myAdd(22);
        list.myAdd(33);
        list.myAdd(44);
        //list.myAdd(55);
        //list.myAdd(11);
        //list.myAdd(22);
       // list.myAdd(33);
        //list.myRemove(22);
        //Object a=list.clone();
        System.out.println(list);
    }
//EndOfMainMethod
}
     class MyArrayList<T> {
        Object[] a = new Object[5];
        int index = 0;


        /*public Object  clone();
        {
            //Object clone = super.clone();
            MyArrayList<Object> al=new MyArrayList<Object>();
            for(int i=0;i<index;i++)
            {
                al.myAdd(a[i]);
            }
            return al;
        }*/










//Add Method
        public void myAdd(T data) {
            if (index == a.length)
                grow();
            a[index++] = data;
        }
 //AddAt method
       /* public void addAt(int index,int data)
        {
            if(index>=a.length)
                grow();
            int i=index;
            for (;i>index;i--)
            {
                a[i]=a[i-1];
            }
            a[i]=data;
            index++;
        }*/
        /*public void clear()
        {
            a=null;
            index=0;
        }*/







//Remove method
        /*void myRemove(int inde) {
            if (inde < 0 || inde >= index)
            {
                System.out.println("out of bounds");
                System.exit(0);
            }

            for (int i = inde; i < index - 1; i++) {
                a[i] = a[i + 1];
            }
            index--;
        }*/
// extend add method using grow method
        public void grow()
        {
            Object[] b = new Object[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }

        public String toString() {
            String s = "[";
            for (int i = 0; i < index - 1; i++)
                s += a[i] + ", ";
            s += a[index - 1];
            s += "]";
            return s;

        }


         }

