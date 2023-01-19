package new_proj;

import java.util.Hashtable;

public class hashtable {
public static void main(String[] args) {
Hashtable<Integer,String>t=new Hashtable<Integer, String>();
t.put(101, "Niki");
t.put(102, "Kedar");
t.put(103, "Lakshmi");
t.put(104,"Jason");
System.out.println(t);
//print Jason
System.out.println(t.get(104));
//key number cointains or not
System.out.println(t.containsKey(106));
}
}
