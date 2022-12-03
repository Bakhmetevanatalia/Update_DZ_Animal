package animals.pet;

import animals.Animal;

public class Cat extends Animal{

    public Cat(String name, String color, Integer age, Integer weight) {
        super(name, color, age, weight);
    }
    
    @Override
    public void say(){
        System.out.println("Мяу");
    }
}
