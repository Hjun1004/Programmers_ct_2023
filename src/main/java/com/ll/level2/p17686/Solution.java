package com.ll.level2.p17686;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String[] solution(String[] files) {
        int idx = 0;
        String[] answer = {};

        answer = new String[files.length];

        List<File> fileList = new ArrayList<>();

        for(String file : files){
            boolean check = false;

            StringBuilder num = new StringBuilder();
            StringBuilder head = new StringBuilder();
            StringBuilder tail = new StringBuilder();



            for(int i = 0 ; i < file.length() ; i++){
                char c = file.charAt(i);

                if(c>='0' && c<='9'){
                    num.append(c);
                    check = true;
                }
                else if(!check){
                    head.append(c);
                }
                else{
                    tail.append(file.substring(i));
                    break;
                }
            }

            fileList.add(new File(idx, head.toString(), num.toString(), tail.toString()));

            idx++;

//            System.out.println(head.toString() + num.toString() + tail.toString());
        }

        fileList = fileList.stream().sorted().collect(Collectors.toList());

        for(File file : fileList){
            System.out.println(file.head + file.num + file.tail);
        }

        answer = fileList.stream().map(File::getFilename).toArray(String[] :: new);

        return answer;
    }

    public static class File implements Comparable<File>{
        int idx;
        String head;
        String num;
        String tail;

        public String getFilename(){
            return head+num+tail;
        }

        public File(int idx, String head, String num, String tail) {
            this.idx = idx;
            this.head = head;
            this.num = num;
            this.tail = tail;
        }

        @Override
        public int compareTo(File file) {
            if(this.head.equalsIgnoreCase(file.head)){ // 대소문자가 같은 head 이면
                if(Integer.parseInt(this.num) == Integer.parseInt(file.num)){ // 중간 숫자 까지 같으면 들어온 순서가 빠른 순으로 정렬
                    return this.idx - file.idx; // this.idx 가 먼저 나와서 빼기가 시작되면 먼저 들어온 순서로 정렬된다.
                }
                return Integer.parseInt(this.num) - Integer.parseInt(file.num); // 대소문자가 같은데 숫자가 다르면 기존의 숫자가 먼저 정렬
            }
            return this.head.toLowerCase().compareTo(file.head.toLowerCase()); // 대소문자가 같은거 왜에는 신경쓰지 않으니까 그냥 소문자로 정렬
//            if(this.head.equalsIgnoreCase(file.head)){
//                if(Integer.parseInt(this.num) == Integer.parseInt(file.num)){
////                    return this.idx - file.idx;
//                    return file.idx - this.idx;
//                }
//                return Integer.parseInt(file.num) - Integer.parseInt(this.num);
//            }
//            return file.head.toLowerCase().compareTo(this.head.toLowerCase());
        }
    }
}
