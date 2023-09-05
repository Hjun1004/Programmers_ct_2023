package com.ll.level1.p68644;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {2, 1, 3, 4, 1})

        ).isEqualTo(new int[] {2, 3, 4, 5, 6, 7});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[] {5,0,2,7})

        ).isEqualTo(new int[] {2,5,7,9,12});
    }

}
