package com.ll.level2.p17684;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("KAKAO")
        ).isEqualTo(new int[] {11, 1, 27, 15});
    }


    @Test
    void t2(){
        assertThat(
                new Solution().solution("TOBEORNOTTOBEORTOBEORNOT")
        ).isEqualTo(new int[] {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34});
    }


    @Test
    void t3(){
        assertThat(
                new Solution().solution("ABABABABABABABAB")
        ).isEqualTo(new int[] {1, 2, 27, 29, 28, 31, 30});
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution("AK")
        ).isEqualTo(new int[] {1, 11});
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution("A")
        ).isEqualTo(new int[] {1});
    }
}
