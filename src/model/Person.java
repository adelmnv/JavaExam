package src.model;

public class Person {
     String name;
     int age;

     public Person(){}
     public Person(String n, int a){
         this.name = n; this.age = a;
     }

     public void introduce(){
         System.out.printf("Hello my name is %s and my age is %d\n",name,age);
     }

}
