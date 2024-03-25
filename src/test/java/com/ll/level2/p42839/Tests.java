package com.ll.level2.p42839;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {
    @Test
    void p1(){
        assertThat(
                new Solution().solution("17")
        ).isEqualTo(3);
    }

    @Test
    void p2(){
        assertThat(
                new Solution().solution("011")
        ).isEqualTo(2);
    }
}
