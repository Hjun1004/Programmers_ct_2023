package com.ll.level2.p42885;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
               new Solution().solution(new int[] {70, 50, 80, 50}, 100)
        ).isEqualTo(3);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[] {70, 80, 50}, 100)
        ).isEqualTo(3);
    }
}
