package com.ll.level2.p76502;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("[](){}")
        ).isEqualTo(3);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("}]()[{")
        ).isEqualTo(2);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution("[)(]")
        ).isEqualTo(0);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution("}}}")
        ).isEqualTo(0);
    }
}
