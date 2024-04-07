package com.ll.level2.p131701;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        int start = 0; // 0
        int end = elements.length - 1; //4

        for(int i = 0 ; i <= elements.length - 1 ; i++){
             for(int j = 0 ; j <= elements.length - 1 ; j++ ){
                 start = j;
                 end = (j+i);

                 int num = 0;


                 for(int c = start ; c <= end ; c++){
                     num += elements[c % elements.length];
                 }


                 list.add(num);

             }
        }

        list = list.stream().distinct().sorted().collect(Collectors.toList());

//        System.out.println( "개수는? " + list.size());

//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println(list.get(i));
//        }

        return list.size();
    }
}
