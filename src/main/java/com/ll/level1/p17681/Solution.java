package com.ll.level1.p17681;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = {"#####","# # #", "### #", "# ##", "#####"};

        int count = 0;

        String[] answer = new String[n];

        StringBuilder binary = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            String binaryArr1 = Integer.toBinaryString(arr1[i]);
            String binaryArr2 = Integer.toBinaryString(arr2[i]);

            // 아래걸로 2진수로 표현 했을 때 앞에 0인 부분이 생략되는것에 0을 추가
            while(binaryArr1.length() < n){
                StringBuilder sb = new StringBuilder(binaryArr1);
                sb.insert(0,"0");
                binaryArr1 = sb.toString();
            }

            while(binaryArr2.length() < n){
                StringBuilder sb2 = new StringBuilder(binaryArr2);
                sb2.insert(0,"0");
                binaryArr2 = sb2.toString();
            }
            //

            for(int j = 0 ; j < n ; j++){
                if (binaryArr1.charAt(j) != binaryArr2.charAt(j)) {
                    binary.append("#");
                }

                else if(binaryArr1.charAt(j) == '1' && binaryArr2.charAt(j) == '1'){
                    binary.append("#");
                }

                else{
                    /* 예시대로 풀려고 추가했는데 결과에서는 이 부분이 필요가 없었음
                    if(j != 0){
                        if(binary.charAt(j-1) == ' '){
                            continue;
                        }
                    }*/
                    binary.append(" ");
                }
            }

            answer[i] = binary.toString();

            binary.delete(0, binary.length());
        }

        return answer;
    }
}
