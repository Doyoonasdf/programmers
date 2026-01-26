package com.example.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 배열만들기3
* 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.

intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.

이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
*
* */
public class MakeArray3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {}; // size = 0  빈상태
        List<Integer> list = new ArrayList<>();
        // {{1,3},{0,4}}
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }

        answer =  new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5},new int[][]{{1,3},{0,4}})));
    }

}
