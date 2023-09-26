package com.ll.level1.p150370;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    void t1(){
        assertThat(
                new Solution().solution("2022.05.19", new String[] {"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})

        ).isEqualTo(new int[]{1, 3});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution("2020.01.01", new String[] {"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})

        ).isEqualTo(new int[]{1, 4, 5});
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution("2020.05.17", new String[] {"A 5", "B 20"}, new String[]{"2019.12.18 A", "2019.05.17 B"})

        ).isEqualTo(new int[]{});
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution("2020.01.01", new String[] {"A 1"}, new String[]{"2019.12.09 A", "2019.12.09 A", "2019.12.09 A", "2019.12.09 A", "2019.12.09 A", "2019.12.09 A",
                        "2019.12.09 A", "2019.12.09 A", "2019.12.09 A", "2019.12.09 A", "2019.12.01 A"})

        ).isEqualTo(new int[]{11});
    }

    @Test
    void t5(){
        assertThat(
                new Solution().solution("2020.04.16", new String[] {"A 12", "S 4"}, new String[]{"2019.04.17 A", "2014.04.16 S", "2017.04.17 S", "2017.04.17 S"})

        ).isEqualTo(new int[]{2, 3, 4});
    }

    @Test
    @DisplayName("테스트케이스 15 실패를 해결하기 위한 테스트 케이스")
    void t6(){
        assertThat(
                new Solution().solution("2020.01.01", new String[] {"A 12", "S 4"}, new String[]{"2019.01.01 A", "2014.04.16 S", "2017.04.17 S", "2017.04.17 S"})

        ).isEqualTo(new int[]{1, 2, 3, 4});
    }
}
