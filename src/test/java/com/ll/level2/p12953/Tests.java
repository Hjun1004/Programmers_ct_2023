package com.ll.level2.p12953;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[]{2, 6, 8, 14})
        ).isEqualTo(168);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[]{1, 2, 3})
        ).isEqualTo(6);
    }
}
