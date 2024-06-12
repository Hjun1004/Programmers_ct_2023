package com.ll.level2.p12900;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(4)
        ).isEqualTo(5);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(5)
        ).isEqualTo(8);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(6)
        ).isEqualTo(13);
    }
}
