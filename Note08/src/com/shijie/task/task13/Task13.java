package com.shijie.task.task13;

public class Task13 {
    public static void main(String[] args) {

        Person[] persons = new Person[4];

        persons[0] = new Student("小明", '男', 15, "00023102");
        persons[1] = new Student("小王", '男', 17, "00000001");
        persons[2] = new Teacher("小红", '女', 22, 1);
        persons[3] = new Teacher("张飞", '男', 30, 5);

        //Person temp;

        Student s = (Student) persons[0];
        s.printInfo();

        System.out.println("---------------------------");

        Teacher t = (Teacher) persons[3];
        t.printInfo();

        Task13 task13 = new Task13();
        task13.bubbleSort(persons);

        System.out.println("----排序后的数组----");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        for (int i = 0; i < persons.length; i++) {
            task13.test(persons[i]);
        }

//        for (int i = 0; i < persons.length - 1; i++) {
//            for (int j = 0; j < persons.length - i - 1; j++) {
//                if (persons[j].getAge() < persons[j + 1].getAge()) {
//                    temp = persons[j];
//                    persons[j] = persons[j + 1];
//                    persons[j + 1] = temp;
//                }
//            }
//        }

    }

    public void bubbleSort(Person[] persons) {
        Person temp;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }
}
