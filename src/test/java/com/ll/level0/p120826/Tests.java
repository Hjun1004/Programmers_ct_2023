package com.ll.level0.p120826;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("abcdef , f -> abcde")
    void t1(){
        assertThat(new Solution().solution("abcdef", "f")).isEqualTo("abcde");
    }

    @Test
    @DisplayName("BCBdbe , B -> Cdbe")
    void t2(){
        assertThat(new Solution().solution("BCBdbe", "B")).isEqualTo("Cdbe");
    }


}
