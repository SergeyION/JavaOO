package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("wer", "fgh", 21);
        // по полям
//        cat.name = "Марсалес";
//        cat.color = "Black";
//        cat.age = 10;
        // инкапсулировали!!!
        cat.setName("Марсалес");
        cat.setColor("Рыжий");
        cat.setAge(10);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();



//        Point3D pointA = new Point3D(2, 3, 4);
//        System.out.println("Длинна вектора: " + pointA.lengthVector()); // 5.385164807134504
//        Point3D pointB = new Point3D(3, 4, 5);
//        System.out.println("Скалярное произведение: " + pointA.ScalarMultiply(pointB)); // 38.0
//        System.out.println("Произведение с другим вектором: " + pointA.Multy(pointB).x + ", "
//            + pointA.Multy(pointB).y + ", " + pointA.Multy(pointB).z); // -1.0, 2.0, -1.0
//        System.out.println("Угол между векторами: " + pointA.cosTriangle(pointB)); // 0.9979288897338914
    }
}


