package com.btn;

import java.util.List;

public class AddNumbers {

    static Integer sumNumbers(List<Integer> numbers){
        int num = 0;
        for (Integer number : numbers) {
            num = num + number;
        }
        return num;
    };

    public static void main(String[] args) {


    }
}
