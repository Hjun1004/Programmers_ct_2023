package com.ll.level2.p12985;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(8, 4, 7)
        ).isEqualTo(3);
    }
}
