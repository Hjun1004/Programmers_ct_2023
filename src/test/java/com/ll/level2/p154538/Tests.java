package com.ll.level2.p154538;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(10, 40, 5)
        ).isEqualTo(2);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(10, 40, 30)
        ).isEqualTo(1);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(2, 5, 4)
        ).isEqualTo(-1);
    }
}
