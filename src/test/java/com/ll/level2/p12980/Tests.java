package com.ll.level2.p12980;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(5)
        ).isEqualTo(2);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(6)
        ).isEqualTo(2);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(5000)
        ).isEqualTo(5);
    }
}
