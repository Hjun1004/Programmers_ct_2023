package com.ll.level0.p120821;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5] => [5, 4, 3, 2, 1]")
    void t1(){
        assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{5,4,3,2,1});
    }

    @Test
    @DisplayName("[1, 1, 1, 1, 1, 2] => [2, 1, 1, 1, 1, 1]")
    void t2(){
        assertThat(new Solution().solution(new int[]{1, 1, 1, 1, 1, 2})).isEqualTo(new int[]{2, 1, 1, 1, 1, 1});
    }

    @Test
    @DisplayName("[1, 0, 1, 1, 1, 3, 5] => [5, 3, 1, 1, 1, 0, 1]")
    void t3(){
        assertThat(new Solution().solution(new int[]{1, 0, 1, 1, 1, 3, 5})).isEqualTo(new int[]{5, 3, 1, 1, 1, 0, 1});
    }

//    @Test
//    @DisplayName("4, 12 => 3")
//    void t2(){
//        assertThat(new Solution().solution(4,12)).isEqualTo(3);
//    }


}
