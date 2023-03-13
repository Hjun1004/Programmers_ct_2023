package com.ll.level0.p120830;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10인분을 시키면 124000원이 나와야 한다.")
    void t1(){
        assertThat(new Solution().solution(10)).isEqualTo(124000);

    }
}
