package com.ll.level2.p12981;

public class Solution {
    int count = 1;
//    Stack<String> stack = new Stack<>();
    public int[] solution(int n, String[] words) {
        int[] answer = {};

//        stack.push(words[0]);
        int a = dfs(words, words[0],1, n); // 처음 시작할 때 첫 번째 단어 stack에 넣고 다음 단어부터 dfs에 넣어서 비교
        // 할려고 했는데 stack 보다 그냥 for쓰는게 시간 복잡도가 O(1)이라서 조금 더 빠른거 같다.


        if(a == -1){
            answer = new int[] {0, 0};
        }else{
            answer = new int[] {(a%n)+1 , count};
        }

        return answer;
    }

    private int dfs(String[] words, String prevWord, int idx, int n) {
        int a = 0;

        String nowWord = words[idx];

        if(idx%(n)==0){
            System.out.println(count);
            count++;
        }

        if(prevWord.charAt(prevWord.length()-1) != nowWord.charAt(0)){
//            System.out.println("prevWord 단어 끝자리는 = " + prevWord.charAt(prevWord.length()-1));
//            System.out.println("nowWord 단어 시작자리는는 = " + nowWord.charAt(0));
//            System.out.println("지금 인덱스는 = " + idx);

            return idx;
        }
        for(int i = 0 ; i < idx ; i++){
            if(words[i].equals(nowWord)){
                return idx;
            }
        }
//        if(stack.contains(nowWord)){
//            return idx;
//        }

        if(idx == words.length-1){
            return -1;
        }




//        stack.push(nowWord);
        a = dfs(words, nowWord, ++idx, n);


        return a;
    }
}
