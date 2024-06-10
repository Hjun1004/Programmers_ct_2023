package com.ll.level2.p42883;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution("1924", 2)
        ).isEqualTo("94");
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("1231234", 3)
        ).isEqualTo("3234");
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution("4177252841", 4)
        ).isEqualTo("775841");
    }
}
