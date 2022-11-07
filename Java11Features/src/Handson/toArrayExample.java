package Handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class toArrayExample {
    public static void main(String[] args) {
        /*ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Integer[] arr=list.stream().toArray(size ->new Integer[size]);
        System.out.println(Arrays.toString(arr));
        Integer[] arr1=list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));*/
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("efg");
        System.out.println(list);
        String[] arr=list.toArray(String[] ::new);
        System.out.println(Arrays.toString(arr));

        }

    }
