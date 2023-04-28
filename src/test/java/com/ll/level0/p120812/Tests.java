package com.ll.level0.p120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*
System.out.println(new Solution().solution(2, 3)); // -1
System.out.println(new Solution().solution(11, 11)); // 1
System.out.println(new Solution().solution(7, 99)); // -1*/

public class Tests {
    @Test
    @DisplayName("1, 2, 7, 10, 11 => 7")
    void t1(){
        assertThat(new Solution().solution(new int[] {1, 2, 3, 3, 3, 4})).isEqualTo(3);
    }

    @Test
    @DisplayName("[9, -1, 0] => 0")
    void t2(){
        assertThat(new Solution().solution(new int[] {1, 1, 2, 2})).isEqualTo(-1);
    }

    @Test
    @DisplayName("[9, -1, 0] => 0")
    void t3(){
        assertThat(new Solution().solution(new int[] {1,1})).isEqualTo(1);
    }

}
