package com.ll.level0.p120813;

import com.ll.level0.p120813.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10 => [1, 3, 5, 7, 9]")
    void t1(){
        assertThat(new Solution().solution(10)).isEqualTo(new int[] {1,3,5,7,9});
    }

    @Test
    @DisplayName("15 => [1, 3, 5, 7, 9, 11, 13, 15]")
    void t2(){
        assertThat(new Solution().solution(15)).isEqualTo(new int[] {1, 3, 5, 7, 9, 11, 13, 15});
    }

}
