package com.ll.level0.p181943;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("\"He11oWor1d\" , \"lloWorl\" => \"HelloWorld\"")
    void t1(){
        assertThat(new Solution().solution("He11oWor1d", "lloWorl", 2)).isEqualTo("HelloWorld");
    }

    @Test
    @DisplayName("\"Program29b8UYP\" , \"merS123\" => \"ProgrammerS123\"")
    void t2(){
        assertThat(new Solution().solution("Program29b8UYP", "merS123", 7)).isEqualTo("ProgrammerS123");
    }

    @Test
    @DisplayName("\"Program29b8UYP\" , \"merS123\" => \"ProgrammerS123\"")
    void t3(){
        assertThat(new Solution().solution("He11oHe11o", "ll", 2)).isEqualTo("HelloHe11o");
    }

}
