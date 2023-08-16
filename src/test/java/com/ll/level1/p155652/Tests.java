package com.ll.level1.p155652;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    void t1() {
        assertThat(
                new Solution().solution("aukks", "wbqd", 5)

        ).isEqualTo("happy");
    }

    @Test
    void t2() {
        assertThat(
                new Solution().solution("y", "baz", 1)

        ).isEqualTo("c");
    }

    @Test
    void t3() {
        assertThat(
                new Solution().solution("ybc", "az", 1)

        ).isEqualTo("bcd");
    }

}
