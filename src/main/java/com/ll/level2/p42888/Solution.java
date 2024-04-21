package com.ll.level2.p42888;

import java.util.HashMap;

public class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};

        HashMap<String, String> membermap = new HashMap<>();

        for(String a : record){
            String[] chat = a.split(" ");


            if(chat[0].equals("Enter")){
                if(membermap.containsKey(chat[0])){
                    membermap.put(chat[1], chat[2]);
                }
                else{
                    membermap.put(chat[1], chat[2]);
                }
            }
            else if(chat[0].equals("Change")){
                membermap.put(chat[1], chat[2]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String ch : record){
            String[] chat = ch.split(" ");

            if(ch.contains("Enter")){
                sb.append(membermap.get(chat[1]) + "님이 들어왔습니다.");
                sb.append(",");
            }
            else if(ch.contains("Leave")){
                sb.append(membermap.get(chat[1]) + "님이 나갔습니다.");
                sb.append(",");
            }
        }

        answer = sb.toString().split(",");

        for(String a : answer){
            System.out.println(a);
        }


        return answer;
    }

}
