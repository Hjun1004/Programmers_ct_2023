package com.ll.level0.p120819;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("5500 => [1,0]]")
    void t1(){
        assertThat(new Solution().solution(5500)).isEqualTo(new int[] {1,0});
    }

    @Test
    @DisplayName("15,000 => [2, 4000]")
    void t2(){
        assertThat(new Solution().solution(15000)).isEqualTo(new int[] {2, 4000});
    }

}
