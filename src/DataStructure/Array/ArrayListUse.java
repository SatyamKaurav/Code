package DataStructure.Array;

import java.util.ArrayList;

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);

        //Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(25);
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i) == 8) {
                System.out.println("Find it ");
            }
        }
        System.out.println(list);


        //Removing elements
        list.remove(0);
        list.remove(25);

    }
}
