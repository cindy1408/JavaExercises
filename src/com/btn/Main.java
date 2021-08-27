package com.btn;

import com.btn.book.Book;
import com.btn.book.BookShelve;
import com.btn.book.BookShelveService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        // Exercise 1
//
//        List<Integer> numberList1 = Arrays.asList(1, 2, 1, 1, 3, 2, 1, 5);
//        List<Integer> numberList2 = Arrays.asList(4, 14, 20, 51, 81);
//
//        System.out.println(AddNumbers.sumNumbers(numberList1));
//        System.out.println(AddNumbers.sumNumbers(numberList2));
//
//        // Exercise 2
//
//        System.out.println(LargestNumber.findLargest(numberList1));
//        System.out.println(LargestNumber.findLargest(numberList2));
//
//        // Exercise 3
//
//        ArrayList<Integer> array1 = new ArrayList<Integer>();
//        array1.add(2);
//        array1.add(6);
//        array1.add(8);
//        array1.add(10);
//
//        ArrayList<Integer> array2 = new ArrayList<Integer>();
//        array2.add(3);
//        array2.add(67);
//        array2.add(12);
//        array2.add(5);
//
//        System.out.println(MergeList.mergeList(array1, array2));
//
//
//        // Exercise 4
//
//        Person sarah = new Person("sarah", Gender.FEMALE, 31);
//        Person john = new Person("john", Gender.MALE, 21);
//        Person cassie = new Person("cassie", Gender.FEMALE, 4);
//        Person james = new Person("james", Gender.MALE, 71);
//        Person harry = new Person("harry", Gender.MALE, 52);
//        Person amy = new Person("amy", Gender.FEMALE, 53);
//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(sarah);
//        people.add(john);
//        people.add(cassie);
//        people.add(james);
//        people.add(amy);
//        people.add(harry);
//
//        AverageAge.averageAge(people, Gender.FEMALE);
//

        // Exercise 5

        ArrayList<Book> books = new ArrayList<>();

        Book HappyFeet = new Book("Happy Feet", "Harry", 2020);
        Book HarryPotter = new Book("Harry Potter", "JK Rowling", 2000);
        Book Barbie = new Book("Barbie", "Jamie", 1999);


        BookShelve home = new BookShelve(5,books);

        BookShelveService.add(home, HappyFeet);
//        BookShelveService.add(home, HarryPotter);
        BookShelveService.add(home, Barbie);

//        BookShelveService.remove(home, Barbie);
        BookShelveService.remove(home, HarryPotter);


        System.out.println(books);

    }
}
