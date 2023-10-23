package com.ll.level2.p1844;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
//    int d[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    int dx[] = {1, -1, 0, 0};
    int dy[] = {0, 0, 1, -1};

    int depth = Integer.MIN_VALUE;

    int endCheck = 0;

    public int solution(int[][] maps) {
        int answer = 0;

        bfs(maps);

        return depth;
    }

    void bfs(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;

        Queue<Point> q = new LinkedList<>();

        boolean visited[][] = new boolean[n][m];

        Point startPoint = new Point();

        startPoint.setX(0);
        startPoint.setY(0);

        q.add(startPoint);

        visited[0][0] = true;


        while(!q.isEmpty()){
            Point nowPoint = q.poll();

            int x = nowPoint.x;
            int y = nowPoint.y;

            System.out.println("[" + x + "]" + " [" + y + "]" );

            if(x == n-1 && y == m-1){
                q.clear();
                endCheck = 1;
                continue;
            }

            visited[x][y] = true;

            for(int i = 0; i < dx.length; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];

                if(newX > -1 && newY > -1 && newY < maps[0].length && newY < maps.length){
                    if(maps[newX][newY] == 1 && !visited[newX][newY]){
                        Point nextPoint = new Point(newX, newY);
                        q.add(nextPoint);
                    }
                }

            }
        }

        if(endCheck != 1){
            depth = -1;
        }
    }

    class Point{
        int x;
        int y;

        public Point(){
            ;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


}
