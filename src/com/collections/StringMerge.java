package com.collections;

public class StringMerge {

    static void main() {
        String a="Alwinnnn";
        String b="Shaji";

        StringBuilder res=new StringBuilder();

        int n=Math.max(a.length(),b.length());

        for (int i=0;i<n;i++){

            if(i<a.length()){
                res.append(a.charAt(i));

            }
            if(i<b.length()){
                res.append(b.charAt(i));

            }

        }

        System.out.println("Merged String:"+res);


    }
}
