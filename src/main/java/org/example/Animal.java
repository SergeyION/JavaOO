package org.example;

/**
 * родительский class для Cat
 */
public class Animal {

    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }
    protected String name;
    public void animalInfo(){
        System.out.print("Имя животного: " + name);
    }
    public void voice(){
        System.out.print("Звук!");
    }
    public void jump(){
        System.out.println("Прыжок!");
    }
}
