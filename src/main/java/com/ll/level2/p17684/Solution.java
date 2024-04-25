package com.ll.level2.p17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] solution(String msg) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        String newWord = "";

        int idx = 1;

        for(int i = 65 ; i <= 90 ; i++ ){
            map.put(String.valueOf((char)i), idx++);
        }

        if(msg.length() > 1){
            for(int i = 0 ; i < msg.length() ; i++){
                String start = String.valueOf(msg.charAt(i));

                newWord += msg.charAt(i);

                int nowIndex = i;

                for(int j = 1 ; j < msg.length() ; j++){

                    if(nowIndex+j < msg.length()){

                        String newC = newWord += msg.charAt(nowIndex+j); // 다음 문자까지 붙여서 map 내에서 찾아본다.

                        if(!map.containsKey(newC)) { //다음 문자까지 붙힌게 없으면 새로 추가하고 붙이기 이전 문자의 찾은 값을 list에 추가
                                                     // 에로 들면 start가 K이면 newC는 KA이고 KA가 map에 없으면 list에 K값 숫자를 저장하고, map에 KA를 추가
                            list.add(map.get(start));


                            map.put(newC, idx++);


                            newWord = "";
                            break;

                        }else if(map.containsKey(newC)){

                            start = newWord;

                            i++;
                        }
                    }else{
                        list.add(map.get(start));
                        break;
                    }
                }
            }
        } else{
            list.add(map.get(msg));
        }



        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
