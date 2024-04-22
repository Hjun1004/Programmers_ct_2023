package com.ll.level2.p17679;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"})
        ).isEqualTo(14);
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(6, 6, new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})
        ).isEqualTo(15);
    }
}
