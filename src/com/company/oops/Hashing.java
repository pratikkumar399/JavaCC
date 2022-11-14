package oops;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashing {
    public static void main(String[] args) {
        Hashtable<String, String> h = new Hashtable<String, String>();
        h.put("1", "One");
        h.put("2", "Two");
        h.put("3", "Three");

        Enumeration<String> e = h.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
