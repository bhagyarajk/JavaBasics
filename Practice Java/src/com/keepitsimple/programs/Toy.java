package com.keepitsimple.programs;
import java.util.*;
import java.util.Map.Entry;

public class Toy {
    public static void main(String[] args) {
        System.out.println("main started");
      int []  toys = {3,9,45,60,21,11,67};

      TreeMap map = new TreeMap();

        for (int i = 0; i < toys.length; i++)
        {
            map.put(toys[i], i);
        }
        LinkedList<Entry <Integer,Integer>> list = new LinkedList(map.entrySet());
        System.out.println(list);


        // for calculating the sum
       int sum = 0;
       int i = 0;

        while(sum <= 50 && i < toys.length) {

            sum = sum + list.get(i).getKey();
            i++;
        }
        System.out.println(i);
       for (int j = 0; j < i-1; j++) {
           System.out.println(list.get(j).getValue() +" , "+ list.get(j).getKey());

       }
            
        }
        



    }


