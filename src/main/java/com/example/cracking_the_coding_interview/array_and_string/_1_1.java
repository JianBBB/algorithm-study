package com.example.cracking_the_coding_interview.array_and_string;

public class _1_1 {
    // 중복 문제
    /*
        문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는
        알고리즘을 작성하라. 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘
        또한 고민하라
    */
    public static void main(String[] args) {
        //2024-06-24
        /*
        아이디어 : 문자열을 분리 후 첫글자부터 시작하여 나머지 문자와 하나씩 차례대로 비교해보기
         */

        String str = "abcdea";
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        boolean chk = false;

        for(int i = 0; i < size ; i++){
            if(chk) break;

            for(int j = i+1; j < size ; j++){
                if(charArr[i] == charArr[j]){
                    chk = true;
                    break;
                }
            }
        }

        System.out.println("현재 문자의 중복 상태 : " + chk);
    }
}
