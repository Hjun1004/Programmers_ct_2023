package com.ll.level0.p120883;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1(){
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        assertThat(new Solution().solution(id_pw,db)).isEqualTo("login");
    }
    @Test
    @DisplayName("t2")
    void t2(){
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        assertThat(new Solution().solution(id_pw,db)).isEqualTo("wrong pw");
    }
    @Test
    @DisplayName("t3")
    void t3(){
        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        assertThat(new Solution().solution(id_pw,db)).isEqualTo("fail");
    }
}
