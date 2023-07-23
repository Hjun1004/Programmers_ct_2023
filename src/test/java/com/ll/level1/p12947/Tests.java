package com.ll.level1.p12947;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10")
    void t1(){
        assertThat(
                new Solution().solution(10)

        ).isEqualTo(true);
    }

    @Test
    @DisplayName("12")
    void t2(){
        assertThat(
                new Solution().solution(12)

        ).isEqualTo(true);
    }
}
