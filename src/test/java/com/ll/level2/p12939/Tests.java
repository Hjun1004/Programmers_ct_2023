package com.ll.level2.p12939;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("1 2 3 4")
        ).isEqualTo("1 4");
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("-1 -2 -3 -4")
        ).isEqualTo("-4 -1");
    }
}
