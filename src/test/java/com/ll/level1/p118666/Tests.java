package com.ll.level1.p118666;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5})

        ).isEqualTo("TCMA");
    }

    @Test
    void t2(){ assertThat(
            new Solution().solution(new String[] {"TR", "RT", "TR"}, new int[]{7, 1, 3})

    ).isEqualTo("RCJA");
    }


}
