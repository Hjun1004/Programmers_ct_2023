package com.ll.level1.p12921;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(10)

        ).isEqualTo(4);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(5)

        ).isEqualTo(3);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(3)

        ).isEqualTo(2);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution(9)

        ).isEqualTo(4);
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution(16)

        ).isEqualTo(6);
    }

    @Test
    void t6(){
        assertThat(
                new Solution().solution(25)

        ).isEqualTo(9);
    }


}
