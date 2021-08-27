package com.btn;

import java.util.List;

public class LargestNumber {
    static Integer findLargest (List<Integer> numberList){
        int num = 0;
        for(Integer number : numberList){
            if(number > num){
                num = number;
            }
        }
        return num;
    }

}
