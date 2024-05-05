package com.ll.level2.p12909;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("()()")
        ).isEqualTo(true);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("(())()")
        ).isEqualTo(true);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(")()(")
        ).isEqualTo(false);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution("(()(")
        ).isEqualTo(false);
    }
}
