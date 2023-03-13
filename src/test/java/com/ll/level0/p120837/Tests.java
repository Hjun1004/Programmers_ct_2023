package com.ll.level0.p120837;
import com.ll.level0.p120837.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("23 => 5")
    void t1(){
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("24 => 6")
    void t2(){
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    @DisplayName("999 => 201")
    void t3(){
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }



}
