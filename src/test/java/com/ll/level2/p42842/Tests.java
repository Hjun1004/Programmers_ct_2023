package com.ll.level2.p42842;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(10, 2)
        ).isEqualTo(new int[]{4, 3});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(8, 1)
        ).isEqualTo(new int[]{3, 3});
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(24, 24)
        ).isEqualTo(new int[]{8, 6});
    }
}
