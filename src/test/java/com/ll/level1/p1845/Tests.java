package com.ll.level1.p1845;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {3,1,2,3})

        ).isEqualTo(2);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[] {3,3,3,2,2,4})

        ).isEqualTo(3);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(new int[] {3,3,3,2,2,2})

        ).isEqualTo(2);
    }
}
