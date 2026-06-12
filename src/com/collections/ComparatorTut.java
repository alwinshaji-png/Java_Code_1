package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer> {

    public int compare(Integer o1,Integer o2){
        return o2-o1;
    }

}


class StringLengthComparator implements Comparator<String> {

    public int compare(String o1,String o2){
//        return o1.length()-o2.length();  // Asc order
        return o2.length()-o1.length(); // Desc order
    }

}

public class ComparatorTut {
    static void main() {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(5);
//        list.add(1);
//        list.add(10);
//
//        list.sort(new MyComparator());
//
//        System.out.println(list);

        List<String> words= Arrays.asList("banana","apple","date","jackfruit");

//        words.sort(); sorts based on alphabetical order
//        words.sort(new StringLengthComparator()); // sorts based on length

        words.sort((a,b)->b.length()-a.length());
        System.out.println(words);
    }
}
