package com.ll.level1.p135808;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1})

        ).isEqualTo(8);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})

        ).isEqualTo(33);
    }
}
