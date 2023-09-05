package com.ll.level1.p12915;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new String[] {"sun", "bed", "car"}, 1 )

        ).isEqualTo(new String[] {"car", "bed", "sun"});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(new String[] {"abce", "abcd", "cdx"}, 2 )

        ).isEqualTo(new String[] {"abcd", "abce", "cdx"});
    }


}
