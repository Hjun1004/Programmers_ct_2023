package com.ll.level2.p12985;

public class Solution {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        // 아래 재귀를 쓰던 while을 쓰던 둘 다 해답
//        int c = 0;
//        c = findRound(n, a, b, 0);


        while(!(Math.abs(a-b) ==1 && Math.max(a, b)%2 == 0)){ // 처음에 Math함수 안쓰고 그냥 a - b == 1 이렇게 했다 , 만약 b가 a보다 더 클 수 있다는걸 고려안함...
            answer ++;



//            if(a%2 == 0) a = a/2;
//            else a = a/2+1;

            a = (a%2 == 0) ? a/2 : a/2+1;

//            if(b%2 == 0) b = b/2;
//            else b = b/2+1;

            b = (b%2 == 0) ? b/2 : b/2+1;

        }

        return answer;
    }

    /*
    private int findRound(int n, int a, int b, int round) {
        round++;

        if((a == b-1 || b == a-1) && Math.max(a,b)%2 == 0){
            return round;
        }

        if(a%2 == 0) a = a/2;
        else a = a/2+1;

        if(b%2 == 0) b = b/2;
        else b = b/2+1;

        int c = findRound(n , a, b, round);

        return c;
    }*/
}
