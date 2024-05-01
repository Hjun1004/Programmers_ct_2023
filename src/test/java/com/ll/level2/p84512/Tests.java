package com.ll.level2.p84512;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("AAAAE")
        ).isEqualTo(6);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("AAAE")
        ).isEqualTo(10);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution("I")
        ).isEqualTo(1563);
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution("EIO")
        ).isEqualTo(1189);
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution("AAAAA")
        ).isEqualTo(5);
    }
}
