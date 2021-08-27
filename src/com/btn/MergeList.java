package com.btn;
import java.util.*;

public class MergeList {
    static ArrayList<Integer> mergeList(ArrayList<Integer> numberList1 , ArrayList<Integer> numberList2){
        numberList1.addAll(numberList2);
        Collections.sort(numberList1);
        return numberList1;
    }
}
