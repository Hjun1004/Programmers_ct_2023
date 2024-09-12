package com.ll.level4.p42891;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[] {3, 1, 2}, 5L)
        ).isEqualTo(1);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[] {1}, 3L)
        ).isEqualTo(-1);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(new int[] {1, 10, 10}, 6L)
        ).isEqualTo(3);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution(new int[] {1, 1, 1}, 3L)
        ).isEqualTo(3);
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution(new int[] {3, 1, 1, 1, 2, 4, 3}, 12L)
        ).isEqualTo(6);
    }

    @Test
    void t6(){
        assertThat(
                new Solution().solution(new int[] {4, 2, 3, 6, 7, 1, 5, 8}, 27L)
        ).isEqualTo(5);
    }

    @Test
    void t7(){
        assertThat(
                new Solution().solution(new int[] {4, 2, 3, 6, 7, 1, 5, 8}, 16L)
        ).isEqualTo(3);
    }
}
