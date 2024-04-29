package com.ll.level2.p17687;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(2, 4, 2, 1)
        ).isEqualTo("0111");
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(16, 16, 2, 1)
        ).isEqualTo("02468ACE11111111");
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(16, 16, 2, 2)
        ).isEqualTo("13579BDF01234567");
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution(8, 8, 5, 3)
        ).isEqualTo("27141126");
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution(10, 5, 2, 1)
        ).isEqualTo("02468");
    }

}
