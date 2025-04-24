package t1;

import java.util.ArrayList;
import java.util.List;

/**
 * This Java program demonstrates how to use index mapping between two lists to create a third list.
 *
 * <p>It performs the following steps:
 * <ul>
 *   <li>Creates a list of integers (`list1`) representing 1-based indices.</li>
 *   <li>Creates a list of strings (`list2`) representing a collection of string values.</li>
 *   <li>Uses the values in `list1` (after converting to 0-based indices) to retrieve corresponding elements from `list2`.</li>
 *   <li>Stores the selected elements in a third list (`answer`).</li>
 *   <li>Prints the contents of the `answer` list.</li>
 * </ul>
 *
 * <p>This is a basic example of how integer values can be used to dynamically access and collect values
 * from another list based on index relationships.
 *
 * <p>Note: `list1` must only contain values from 1 to the size of `list2`, or it will cause an IndexOutOfBoundsException.
 *
 */

public class t1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        list1.add(6);
        list1.add(3);
        list1.add(8);
        list1.add(7);
        list1.add(10);
        list1.add(5);
        list1.add(9);
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add("miq");
        list2.add("pgt");
        list2.add("cnn");
        list2.add("dcn");
        list2.add("dfw");
        list2.add("cac");
        list2.add("oxx");
        list2.add("bwt");
        list2.add("feu");
        list2.add("kpm");
        list2.add("zby");
        list2.add("wfk");
        answer.add(list2.get(list1.get(0) - 1));
        answer.add(list2.get(list1.get(1) - 1));
        answer.add(list2.get(list1.get(2) - 1));
        answer.add(list2.get(list1.get(3) - 1));
        answer.add(list2.get(list1.get(4) - 1));
        answer.add(list2.get(list1.get(5) - 1));
        answer.add(list2.get(list1.get(6) - 1));
        answer.add(list2.get(list1.get(7) - 1));
        answer.add(list2.get(list1.get(8) - 1));
        answer.add(list2.get(list1.get(9) - 1));
        System.out.println(answer);

    }
}