package com.ll.level2.p42885;

import java.util.Arrays;

public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;

        int right = people.length-1;

        // 가장 큰 수와 가장 작은 수를 합쳐서 비교해본다. (어차피 보트는 2명 밖에 못탄다)
        // 두 수의 합이 limit를 넘으면 비교했던거에서 큰 수만 보트에 태워서 보낸다. ( right를 -1한다.)
        // 비교하는 숫자들 2개의 합이 limit보다 작으면 그 두 명을 보트에 태워서 보낸다. ( left는 +1 하고, right는 -1 한다.)
        while(left <= right){
            if( people[left] + people[right] <= limit){
                left++;
                right--;
            }
            else if(people[left] + people[right] > limit ){
                right--;
            }

            answer++;
        }

        return answer;
    }

}
