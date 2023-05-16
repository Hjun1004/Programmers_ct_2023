package com.ll.level1.p132267;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2개 가져다 주면, 1병을 돌려받는 가게에, 20개를 가져가면? => 총 19")
    void t1(){
        assertThat(
                new Solution().solution(2, 1, 20)

        ).isEqualTo(19);
    }

    @Test
    @DisplayName("3개 가져다 주면, 1병을 돌려받는 가게에, 20개를 가져가면? => 총 9")
    void t2(){
        assertThat(
                new Solution().solution(3, 1, 20)

        ).isEqualTo(9);
    }


}
