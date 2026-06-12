package com.collections;

import java.util.ArrayList;

public class CollectionArray {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);




        ArrayList<Integer> list2=new ArrayList<>();  // capacity = 10
        System.out.println(list2.size());

        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);

        System.out.println(list2.size());       // capacity = 15

        list2.remove(2);
        list2.remove(2);
        list2.remove(2);
        list2.remove(2);
        list2.remove(2);
        list2.remove(2);
        list2.remove(2);


        System.out.println(list2.size());  // capacity = 15









//        System.out.println(list.get(2));
//        System.out.println(list.size());

//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//
//        for(int i:list)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));


//        list.remove(2);
//        System.out.println(list);

//        list.add(2,70);
//        System.out.println(list);

        // Replace index 2 element
//        list.set(2,60);
//        System.out.println(list);



    }
}
