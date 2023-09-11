package com.ll.level1.p42840;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[]{1,2,3,4,5})

        ).isEqualTo(new int[]{1});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[]{1,3,2,4,2})

        ).isEqualTo(new int[]{1, 2, 3});
    }


}
