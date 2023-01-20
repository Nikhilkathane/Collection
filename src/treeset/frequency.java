package treeset;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        String s="abcdabbaa";
        Map<Character,Integer> niks=new LinkedHashMap<Character,Integer>();
        for(int i=0;i< s.length();i++)
        {
            if(niks.containsKey(s.charAt(i)))
            {
                int value=niks.get(s.charAt(i));
                        value=value+1;
                niks.put(s.charAt(i),value);
            }
            else
            {
                niks.put(s.charAt(i),1);

            }
        }
        System.out.println(niks);
        int min=Integer.MAX_VALUE;
        char ch=0;
        for(char key : niks.keySet())
        {
            int result=niks.get(key);
            if(result<min)
            {
                min=result;
                ch=key;
            }
        }
        System.out.println(ch+" "+min);
    }
}
