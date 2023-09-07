package com.ll.level1.p12901;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("1월 7일 일때")
    void t1(){
        assertThat(
                new Solution().solution(1,7)
        ).isEqualTo("THU");
    }

    @Test
    @DisplayName("1월 10일 일 때")
    void t2(){
        assertThat(
                new Solution().solution(1,10)
        ).isEqualTo("SUN");
    }

    @Test
    @DisplayName("5월 24일 일 때")
    void t3(){
        assertThat(
                new Solution().solution(5,24)
        ).isEqualTo("TUE");
    }


}
