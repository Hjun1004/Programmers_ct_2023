package com.ll.level3.p12927;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(4, new int[] {4, 3, 3})
        ).isEqualTo(12);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(1, new int[] {2, 1, 2})
        ).isEqualTo(6);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(3, new int[] {1,1})
        ).isEqualTo(0);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution(999, new int[] {800, 100, 55, 45})
        ).isEqualTo(1);
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution(9, new int[] {5, 3, 2})
        ).isEqualTo(1);
    }

}
