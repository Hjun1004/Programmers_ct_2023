package com.ll.level0.p120818;

import com.ll.level0.p120818.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1500000 => 142500")
    void t1(){
        assertThat(new Solution().solution(150000)).isEqualTo(142500);
    }

    @Test
    @DisplayName("580000 => 464000")
    void t2(){
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }

    @Test
    @DisplayName("77000 => 77000")
    void t3(){
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }


}
