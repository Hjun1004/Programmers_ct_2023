package com.ll.level2.p17679;

import java.util.Stack;

public class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean complete = false;
        int countCheck = 0;


        int dx[] = {1, 0, 1};
        int dy[] = {0, 1, 1};

        boolean check[][] = new boolean[m][n];

        /*
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(check[i][j] + " ");
            }
            System.out.println();
        }
        */



        while(complete == false){
            int sort = 1;

            Stack<Integer> stack = new Stack<>();

            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    int count = 0;

                    countCheck = 0;

                    char nowalpha = board[i].charAt(j);

//                    System.out.println("지금 알파벳 : " + nowalpha);

                    for(int c = 0 ; c < dx.length ; c++){

                        int newX = i + dx[c];
                        int newY = j + dy[c];

                        if(newX < m && newY < n){
                            char checkAlpha = board[newX].charAt(newY);
//                            System.out.println("대상 알파벳 : " + checkAlpha);
                            if(nowalpha == checkAlpha && Character.isUpperCase(nowalpha) && Character.isUpperCase(checkAlpha)){
                                count++;
                            }
                        }
                    }

                    if(count == 3){
                        check[i][j] = true;
                        check[i+1][j] = true; //하
                        check[i][j+1] = true; //우
                        check[i+1][j+1] = true; //하, 우

                        stack.push(1);
                    }
                }
                System.out.println();
            }

            if(stack.empty()){
                complete = true;
            }

            stack.clear();

            while(sort == 1){
                sort = 0;
                for(int i = 0 ; i < m; i++){
                    for(int j = 0 ; j < n ; j++) {
                        char nowalpha = board[i].charAt(j);

                        if (check[i][j] == false) {
                            boolean tmp = false;
                            char tmpChar;

                            if (i + 1 < m && check[i + 1][j] == true) {
                                sort = 1;

                                tmpChar = nowalpha;

                                nowalpha = Character.toLowerCase(board[i + 1].charAt(j));

                                StringBuilder str = new StringBuilder(board[i]); // 이미 끝난 문자열
                                str.setCharAt(j, nowalpha);

                                board[i] = str.toString();

                                StringBuilder strb = new StringBuilder(board[i + 1]); // 새 문자열

                                strb.setCharAt(j, tmpChar);

                                board[i + 1] = strb.toString();

                                check[i + 1][j] = false;
                                check[i][j] = true;
                            }
                        } else if (check[i][j] == true) {
                            nowalpha = Character.toLowerCase(board[i].charAt(j));

                            StringBuilder str = new StringBuilder(board[i]); // 이미 끝난 문자열
                            str.setCharAt(j, nowalpha);

                            board[i] = str.toString();
                        }

//                        System.out.println();
                    }
                }
            }


//            for(int i = 0 ; i < m; i++){
//                for(int j = 0 ; j < n ; j++){
//                    System.out.print(board[i].charAt(j));
//                }
//                System.out.println();
//            }
//
//            for(int i = 0 ; i < m; i++){
//                for(int j = 0 ; j < n ; j++){
//                    System.out.print(check[i][j] + " ");
//                }
//                System.out.println();
//            }

//            complete = true;
        }

        for(boolean[] a : check){
            for(boolean c : a){
                if(c) answer++;
            }
        }


        return answer;
    }
}
