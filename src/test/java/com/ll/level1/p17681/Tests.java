package com.ll.level1.p17681;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})

        ).isEqualTo(new String[]{"#####","# # #", "### #", "# ##", "#####"});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})

        ).isEqualTo(new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "});
    }
}
