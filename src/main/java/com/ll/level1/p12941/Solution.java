package com.ll.level1.p12941;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int []A, int []B)
    {
        int sum = 0;

//        A = Arrays.stream(A)
//                .boxed() // Integer 타입으로 변경
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();
        // 위 방식으로 했을 때 효율성 문제 발생
        // 우선순위 큐 고려 해볼 것

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0 ; i < A.length ; i++){
            sum += A[ A.length - i - 1 ] * B[i];
        }

        return sum;
    }
}
