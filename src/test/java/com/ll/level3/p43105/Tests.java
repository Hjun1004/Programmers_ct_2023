package com.ll.level3.p43105;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}})
        ).isEqualTo(30);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[][] {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}})
        ).isEqualTo(16);
    }
}
