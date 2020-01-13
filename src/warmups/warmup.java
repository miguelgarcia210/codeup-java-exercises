package warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmup {

    // Write a function to take in two ArrayList sorted of Integers, return the merged list sorted.
    public static ArrayList<Integer> something(ArrayList<Integer> a1, ArrayList<Integer> a2) {

        a1.addAll(a2);
        Collections.sort(a1);

        return a1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8,10,7,9,11));

        System.out.println(something(list1, list2));
    }
}
