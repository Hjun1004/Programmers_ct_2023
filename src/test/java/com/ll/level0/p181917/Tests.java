package com.ll.level0.p181917;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("false, true, true, true => true")
    void t1(){
        assertThat(new Solution().solution(false, true, true, true)).isEqualTo(true);
    }

    @Test
    @DisplayName("true, false, false, false => false")
    void t2(){
        assertThat(new Solution().solution(true, false, false, false)).isEqualTo(false);
    }

}
