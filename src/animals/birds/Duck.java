package animals.birds;

import animals.Animal;

public class Duck extends Animal implements Flying{

    public Duck(String name, String color, Integer age, Integer weight) {
        super(name, color, age, weight);
    }

    @Override
    public void say(){
        System.out.println("Кря");
    }

}

