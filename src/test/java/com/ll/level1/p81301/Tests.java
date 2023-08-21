package com.ll.level1.p81301;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution("one4seveneight")

        ).isEqualTo(1478);
    }
}
