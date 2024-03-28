package com.ll.level2.p12981;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests {

    @Test
    void t1(){
        assertThat(
                new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})
        ).isEqualTo(new int[]{3, 3});
    }

    @Test
    void t2(){
        assertThat(
                new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})
        ).isEqualTo(new int[]{0, 0});
    }

    @Test
    void t3(){
        assertThat(
                new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})
        ).isEqualTo(new int[]{1, 3});
    }

    @Test
    void t4(){
        assertThat(
                new Solution().solution(3, new String[]{"abc", "cbd", "ddd", "ddd", "dbc", "cbd"})
        ).isEqualTo(new int[]{1, 2});
    }

}
