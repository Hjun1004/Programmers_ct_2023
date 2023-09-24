package com.ll.level1.p118666;

class Solution {
    public String solution(String[] survey, int[] choices) {

        StringBuilder sb = new StringBuilder();

        Indicator r = new Indicator("R", 0);
        Indicator t = new Indicator("T", 0);
        Indicator c = new Indicator("C", 0);
        Indicator f = new Indicator("F", 0);
        Indicator j = new Indicator("J", 0);
        Indicator m = new Indicator("M", 0);
        Indicator a = new Indicator("A", 0);
        Indicator n = new Indicator("N", 0);

        Indicator[] sd = {r, t, c, f, j, m, a, n};

        for(int i = 0 ; i < survey.length ; i++){
            String[] sl = survey[i].split("");

            Indicator firstIndicator = null;
            Indicator secondIndicator = null;

            for (int k = 0; k < sd.length; k++) {
                if (sd[k].getIden().equals(sl[0])) {
                    firstIndicator = sd[k];
                }
                if (sd[k].getIden().equals(sl[1])) {
                    secondIndicator = sd[k];
                }
            }


            switch (choices[i]){
                case 1: firstIndicator.setScore(firstIndicator.getScore()+3); break;

                case 2: firstIndicator.setScore(firstIndicator.getScore()+2); break;

                case 3: firstIndicator.setScore(firstIndicator.getScore()+1); break;

                case 4: break;

                case 5: secondIndicator.setScore(secondIndicator.getScore()+1); break;

                case 6: secondIndicator.setScore(secondIndicator.getScore()+2); break;

                case 7: secondIndicator.setScore(secondIndicator.getScore()+3); break;
            }
        }

        for(int i = 1; i < 5 ; i++){
            switch (i){
                case 1:
                    if(r.getScore() > t.getScore()){
                        sb.append(r.getIden());
                    }
                    else if(r.getScore() < t.getScore()){
                        sb.append(t.getIden());
                    }
                    else if(r.getScore() == t.getScore()){
                        sb.append(r.getIden());
                    }
                    break;

                case 2:
                    if(c.getScore() > f.getScore()){
                        sb.append(c.getIden());
                    }
                    else if(c.getScore() < f.getScore()){
                        sb.append(f.getIden());
                    }
                    else if(c.getScore() == f.getScore()){
                        sb.append(c.getIden());
                    }
                    break;

                case 3:
                    if(j.getScore() > m.getScore()){
                        sb.append(j.getIden());
                    }
                    else if(j.getScore() < m.getScore()){
                        sb.append(m.getIden());
                    }
                    else if(j.getScore() == m.getScore()){
                        sb.append(j.getIden());
                    }
                    break;

                case 4:
                    if(a.getScore() > n.getScore()){
                        sb.append(a.getIden());
                    }
                    else if(a.getScore() < n.getScore()){
                        sb.append(n.getIden());
                    }
                    else if(a.getScore() == n.getScore()){
                        sb.append(a.getIden());
                    }
                    break;
            }
        }

        return sb.toString();
    }
}

class Indicator{
    String iden;
    int score;


    public Indicator(String iden, int score, int indicators) {
        this.iden = iden;
        this.score = score;
    }

    public Indicator(String iden, int score) {
        this.iden = iden;
        this.score = score;
    }

    public String getIden() {
        return iden;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}