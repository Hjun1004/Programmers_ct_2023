package com.ll.level1.p150370;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};


        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // 자바에서 백슬래시와 따옴표는 문자 그 자체만으로는 출력되지 않는 특수문자이다.
        // split() 메소드는 파라미터로 정규식을 입력 받는데, 정규식에서 마침표(.)는 임의의 한 문자를 의미합니다.
        // . 를 기준으로 split을 사용하고 싶으면 [.] 이나 \\을 이용하여 사용해야함
        String[] date = today.split("\\.");

        int[] dateNum = new int[date.length];

        for(int i = 0 ; i < date.length ; i++){
            dateNum[i] = Integer.parseInt(date[i]);
        }

//        System.out.println(Arrays.toString(date));
//
//        System.out.println(Arrays.toString(dateNum));

        List<ExpirationDate> expirationDateList = new ArrayList<>();

        for(String term : terms){
            String[] termSplit = term.split(" ");

            expirationDateList.add(new ExpirationDate(termSplit[0], Integer.parseInt(termSplit[1])));
        }



        for(ExpirationDate expirationDate : expirationDateList){
            if(expirationDate.getType().equals("A")){
                System.out.println(expirationDate.getType());
            }
        }



        return answer;
    }
}

class ExpirationDate{
    String type;
    int howLong;

    public ExpirationDate(String type, int howLong) {
        this.type = type;
        this.howLong = howLong;
    }

    public String getType() {
        return type;
    }

    public int getHowLong() {
        return howLong;
    }
}
