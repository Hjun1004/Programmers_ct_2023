package com.ll.level1.p150370;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

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


        for(int i = 0 ; i < privacies.length ; i++){
            String[] privacy = privacies[i].split(" ");

            String[] firstPrivacy = privacy[0].split("\\.");

            int[] ch = new int[firstPrivacy.length];

            for(int j = 0 ; j < firstPrivacy.length ; j++){
                ch[j] = Integer.parseInt(firstPrivacy[j]);
            }

            System.out.println(Arrays.toString(ch));

            for(String term : terms){
                String[] termSplit = term.split(" ");

                expirationDateList.add(new ExpirationDate(termSplit[0], Integer.parseInt(termSplit[1])));
            }

            ExpirationDate expiration = null;

            for(ExpirationDate expirationDate : expirationDateList){
                if(expirationDate.getType().equals(privacy[1])){
                    expiration = expirationDate;
                }
            }

            System.out.println(expiration.getType());

            int index = ch[1]-1; // ex) ch[1]이 5라면 index는 4가 된다. month[4] 는 5이다.

            for(int c = expiration.getHowLong() ; c > 0 ; c--){
                index++;
                if(index >= 12){
                    index = 0;
                    ch[0]++;
                }
            }

            ch[1] = month[index];

            if(ch[2] == 1){
                if(ch[1] == 1){
                    ch[0]-=1;
                    ch[1] = 12;
                    ch[2] = 28;
                }
                else{
                    ch[1]-=1;
                    ch[2] = 28;
                }
            }
            else{
                ch[2] -= 1;
            }

            System.out.println(Arrays.toString(ch));
            System.out.println();

            if(dateNum[0] > ch[0]){
                answer.add(i+1);
                System.out.println(i+1);
            }
            else if(dateNum[0] == ch[0]){
                if(dateNum[1] > ch[1]){
                    answer.add(i+1);
                    System.out.println(i+1);
                }
                else if(dateNum[1] == ch[1]){
                    if(dateNum[2] > ch[2]){
                        answer.add(i+1);
                        System.out.println(i+1);
                    }
                }
            }

        }



        return answer.stream().mapToInt(e ->e).toArray();
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
