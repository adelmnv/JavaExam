package src;

import src.model.Person;
import src.model.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //1
        Person person = new Person("Maria",27);
        person.introduce();
        //2
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(15);
        rectangle.setWidth(10);
        System.out.println("H = "+rectangle.getHeight() + " W = " + rectangle.getWidth());
        System.out.println("S = "+rectangle.calculateArea());
        //3
        int[] even_num = IntStream.of(1,6,5,3,7,8,10,12).filter(x-> x%2==0).toArray();
        Arrays.stream(even_num).forEach(x-> System.out.print(x + " "));
        System.out.println();

        //4
        Summation summation = new Summation() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int res = summation.sum(12,7);
        System.out.println(res);
        //5
        List<String> list = List.of("mum","dad","bird");
        convertToUppercase(list).stream().forEach(x-> System.out.print(x+" "));
    }

    public static List<String> convertToUppercase (List<String>text){
        List<String> res = text.stream().map(String::toUpperCase).toList();
        return res;
    }
}

interface Summation{
    int sum(int a, int b);
}
