package starters.generic.stack_exe;

import starters.generic.stack_exe.no_generics.StackArray;
import starters.generic.stack_exe.some_objects.Animal;
import starters.generic.stack_exe.some_objects.Person;
import starters.generic.stack_exe.some_objects.Runner;
import starters.generic.stack_exe.some_objects.Student;

public class Program {
    public static StackArray concatenateStacks(StackArray s1, StackArray s2) throws Exception {
        StackArray res = new StackArray();

        while (!s1.isEmpty()) {
            res.push(s1.pop());
        }

        while (!s2.isEmpty()) {
            res.push(s2.pop());
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
//        StackArray<Person> s = new StackArray<Student>();
//
//        StackArray<Student> s1 = new StackArray<Student>();
//        s1.push(new Student(111, "gogo", 98.2));
//        s1.push(new Student(222, "momo", 82.9));
//
//        StackArray<Runner> s2 = new StackArray<Runner>();
//        s2.push(new Runner(333, "yoyo", 12.3));
//        s2.push(new Runner(444, "koko", 14.1));
//
//        StackArray<Person> s = new StackArray<Person>();
//        s.push(new Student(555, "dodo", 91.4));
//        s.push(new Runner(777, "toto", 11.5));
//
//        StackArray<Person> res1 = concatenateStacks(s1, s2);
//        System.out.println(res1);
//
//        StackArray<Person> res2 = concatenateStacks(s, s2);
//        System.out.println(res2);
//
//        StackArray<Animal> s3 = new StackArray<Animal>();
//        s3.push(new Animal("horse", 4));
//        s3.push(new Animal("bird", 2));
//
//        StackArray<Animal> s4 = new StackArray<Animal>();
//        s3.push(new Animal("dog", 4));
//        s3.push(new Animal("elephant", 2));
//        StackArray<Animal> res3 = concatenateStacks(s3, s4);
//        System.out.println(res3);
//        StackArray<Person> res3 = concatenateStacks(s1, s3);
    }

}
