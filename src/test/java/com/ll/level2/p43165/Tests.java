package com.ll.level2.p43165;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[]{1,1,1,1,1}, 3)
        ).isEqualTo(5);
    }
}
