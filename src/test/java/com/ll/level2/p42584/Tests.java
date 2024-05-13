package com.ll.level2.p42584;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {1, 2, 3, 2, 3})
        ).isEqualTo(new int[] {4, 3, 1, 1, 0});
    }

}
