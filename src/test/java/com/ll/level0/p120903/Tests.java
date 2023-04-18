package com.ll.level0.p120903;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3] -> 2")
    void t1(){
        assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
    }

    @Test
    @DisplayName("[1, 2, 3] -> 2")
    void t2(){
        assertThat(new Solution().solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
    }

}
