package com.ll.level2.p84512;

public class Solution {

    public int solution(String word) {
        int answer = 0;

        char[] ch = {'A', 'E', 'I', 'O', 'U'};

        int[] idxArr = {0, 0, 0, 0, 0};

        answer = dfs("", word, ch, idxArr, 0, 0);

        return answer;
    }

    private int dfs(String nowWord, String word, char[] ch, int[] idxArr, int count, int where) {

        if(nowWord.equals(word)) return count;

        if(where < 5){

            if(idxArr[where] == 5){ // 해당 위치의 단어가 U로 되있으면 A로 초기화 시킨다.
                idxArr[where] = 0;
            }

            nowWord += ch[idxArr[where]];

            idxArr[where]++;

            where++;
        }
        else if(where == 5){
            where-- ;

            for(int i = where ; i >= 0 ; i--){  // 단어가 꽉차면 끝에부터 U인걸 없앤다.
                if(nowWord.charAt(i) == 'U'){
                    nowWord = nowWord.substring(0, i);
                }
                else{
                    where = i;

                    break;
                }
            }

            nowWord = nowWord.substring(0, where);
            nowWord += ch[idxArr[where]];    // 단어의 다음 단어로 교체한다.

            idxArr[where]++;

            where++;

            System.out.println(nowWord);
        }

        count++;

        int a = dfs(nowWord, word, ch, idxArr, count, where);

        return a;
    }
}
