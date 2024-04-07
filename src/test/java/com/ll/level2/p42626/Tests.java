package com.ll.level2.p42626;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {1, 2, 3, 9, 10, 12}, 7)
        ).isEqualTo(2);
    }

}
