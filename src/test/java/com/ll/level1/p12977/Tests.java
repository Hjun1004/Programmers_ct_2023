package com.ll.level1.p12977;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new int[]{1,2,3,4})

        ).isEqualTo(1);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new int[]{1,2,7,6,4})

        ).isEqualTo(4);
    }


}
