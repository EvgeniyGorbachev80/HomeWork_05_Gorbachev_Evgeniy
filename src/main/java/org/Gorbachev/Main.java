package org.Gorbachev;

//todo 1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.
//     2. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Student>))
//        формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его.
//     3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя
//        (его id) и формирования учебной группы, путем вызова метода из сервиса.
//     4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.

import java.util.Arrays;

import org.Gorbachev.controller.Controller;
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        // Creating some students and teachers
        controller.createStudent("Doe", "John", "Smith");
        controller.createStudent("Smith", "Jane", "Doe");
        controller.createTeacher("Johnson", "Alice", "Doe");
        controller.createTeacher("Williams", "Bob", "Smith");

        // Getting all students and teachers
        System.out.println("All Students:");
        controller.getAllStudents();

        System.out.println("\nAll Teachers:");
        controller.getAllTeachers();

        // Creating a student group
        controller.createStudentGroup(1, Arrays.asList(1, 2));

        // Printing student group
        System.out.println("\nStudent Group:");
        controller.printStudentGroup();
    }
}
