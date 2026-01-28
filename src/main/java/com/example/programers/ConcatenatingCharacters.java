package com.example.programers;

import java.util.Arrays;

/*
* 예제 1번의 my_string에서 인덱스 3, 5, 6, 11, 12, 14, 16, 17에 해당하는 글자는 각각 g, o, r, m, r, a, p, e이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, r, o, g, r, a, m, m, e, r, s입니다. 따라서 "programmers"를 return 합니다.
* 예제 2번의 my_string에서 인덱스 0, 1, 2, 3에 해당하는 글자는 각각 z, p, i, a이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, i, z, z, a입니다. 따라서 "pizza"를 return 합니다.
* */
//글자 이어 붙여 문자열 만들기
public class ConcatenatingCharacters {

    static String solution(String my_string, int[] index_list) {
        String answer = "";

        String[] arr = my_string.split("");
        for (int i = 0; i < index_list.length; i++) {
            answer += arr[index_list[i]];

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe",new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
    }

}
