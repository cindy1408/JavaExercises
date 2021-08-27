package com.btn;

import java.util.ArrayList;
import java.util.List;

public class AverageAge {

    static double averageAge (ArrayList<Person> person, Gender gender){
        List<Integer> ages = new ArrayList<>();
        person.forEach(p -> {
            if(p.getGender().equals(gender)){
                int age = p.getAge();
                System.out.println(age);
                ages.add(age);
            }
        });
        System.out.println(ages);
        int num = 0;
        for(int age : ages ){
            num = num + age;
        }
        double averageAge = num/ ages.size();
        System.out.println(averageAge);
        return averageAge;
    }
}
