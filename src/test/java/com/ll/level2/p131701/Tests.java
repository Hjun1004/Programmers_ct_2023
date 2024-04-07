package com.ll.level2.p131701;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {7,9,1,1,4})
        ).isEqualTo(18);
    }
}
