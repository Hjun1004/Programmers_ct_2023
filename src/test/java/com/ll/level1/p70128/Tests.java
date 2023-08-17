package com.ll.level1.p70128;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {1, 2, 3, 4}, new int[] {-3, -1, 0, 2})

        ).isEqualTo(3);
    }
}
