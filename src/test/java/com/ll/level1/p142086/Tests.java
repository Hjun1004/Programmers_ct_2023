package com.ll.level1.p142086;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution("banana")

        ).isEqualTo(new int[] {-1, -1, -1, 2, 2, 2});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("foobar")

        ).isEqualTo(new int[] {-1, -1, 1, -1, -1, -1});
    }
}
