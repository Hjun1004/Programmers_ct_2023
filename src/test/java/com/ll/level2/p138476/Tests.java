package com.ll.level2.p138476;

import com.ll.level2.P138476.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3})
        ).isEqualTo(3);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3})
        ).isEqualTo(2);
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3})
        ).isEqualTo(1);
    }

}
