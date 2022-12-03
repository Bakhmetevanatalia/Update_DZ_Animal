package animals.pet;

import animals.Animal;

public class Dog extends Animal{
    public Dog(String name, String color, Integer age, Integer weight) {
        super(name, color, age, weight);
    }
    
    @Override
    public void say(){
        System.out.println("Гав");
    }
}
