package com.ll.level2.p42839;

import java.util.HashSet;

public class Solution {
    static HashSet<Integer> set = new HashSet<>();
    static char[] arr;
    static boolean[] visited;

    public int solution(String numbers) {

        arr = new char[numbers.length()];
        visited = new boolean[numbers.length()];

        for(int i = 0 ; i < numbers.length() ; i++){
            arr[i] = numbers.charAt(i);
        }

        recursion("",0);

        System.out.println(visited[1]);
        return set.size();
    }

    public void recursion(String str, int idx){
        int num;



        if(!str.equals("")){
            num = Integer.parseInt(str);
//            System.out.println("현재 숫자는 = " + num);
            if(isPrime(num)) {
                System.out.println(num);
                set.add(num);
            }
        }

        if(idx == arr.length) return;

        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println("현재 str은 " + str);
//            System.out.println("현재 visited[" + i + "] 는 " + visited[i]);
            if(visited[i]) continue;

            visited[i] = true;
//            System.out.println("현재 visited[" + i + "] 는 " + visited[i]);

            recursion(str+arr[i], idx+1);
//            System.out.println("현재 visited[" + i + "] 는 " + visited[i]);

            visited[i] = false;
//            System.out.println("현재 visited[" + i + "] 는 " + visited[i]);

        }
    }

    public boolean isPrime(int num) {
        if(num == 1 || num == 0) return false;
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
//            System.out.println("num의 제곱근은 = " + Math.sqrt(num));
            if(num%i == 0) return false;
        }

        return true;
    }

}
