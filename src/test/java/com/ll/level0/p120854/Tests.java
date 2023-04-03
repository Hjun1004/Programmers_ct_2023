package com.ll.level0.p120854;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1(){
        String[] strlist = {"We", "are", "the", "world!"};

        assertThat(new Solution().solution(strlist)).isEqualTo(new int[] {2, 3, 3, 6});
    }
    @Test
    @DisplayName("t2")
    void t2(){
        String[] strlist = {"I", "Love", "Programmers."};

        assertThat(new Solution().solution(strlist)).isEqualTo(new int[] {1, 4, 12});
    }
}
