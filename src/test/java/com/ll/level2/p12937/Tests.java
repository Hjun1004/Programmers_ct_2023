package com.ll.level2.p12937;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("baabaa")
        ).isEqualTo(1);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("cdcd")
        ).isEqualTo(0);
    }
}
