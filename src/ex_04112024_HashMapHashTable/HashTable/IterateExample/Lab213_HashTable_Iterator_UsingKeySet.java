package ex_04112024_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Lab213_HashTable_Iterator_UsingKeySet {
    public static void main(String[] args) {
        // create hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<>();

        // Adding key-value pairs as roll no and name
        hash_table.put(1001, "Aditya");
        hash_table.put(1002, "Akshay");
        hash_table.put(1003, "Ayush");
        hash_table.put(1004, "Mohit");

        // use keySet() for getting keySets of Hashtable
        // and storing in a new set
        Set<Integer> Key_set = hash_table.keySet();

        // Create an Iterator object to
        // iterate over the Hashtable
        Iterator<Integer> it = Key_set.iterator();

        // Iterate through the Hashtable object
        // and check for the next element using hasNext() method
        while (it.hasNext()) {
            // for getting a key to a particular entry
            int key = it.next();
            // Print and display the Roll No and Student Name
            System.out.println("Roll No : " + key + "\t | \t Student Name : " + hash_table.get(key));
        }
    }
}