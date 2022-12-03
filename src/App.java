import animals.Animal;
import animals.birds.Duck;
import animals.pet.Cat;
import animals.pet.Dog;
import data.AnimalTypeData;
import data.CommandsData;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animals_list = new ArrayList<Animal>();
        Scanner in = new Scanner(System.in);
        CommandsData comma = null;
        AnimalTypeData animalType = null;

        while (comma != CommandsData.EXIT){
            comma = null;
            while (comma == null){
                System.out.println("Введите комманду add/list/exit");
                try{
                    String Scomma = in.next().toUpperCase();
                    comma = CommandsData.valueOf(Scomma);
                } catch (IllegalArgumentException e){
                    System.out.println("Ошибка ввода");
                }
            }
            if (comma == CommandsData.ADD){
                
                animalType = null;
                while (animalType == null){
                    System.out.println("Введите животное cat/dog/duck");
                    try{
                        String animal_input = in.next().toUpperCase();
                        animalType = AnimalTypeData.valueOf(animal_input);
                    } catch (IllegalArgumentException e){
                        System.out.println("Ошибка ввода");
                    }
                }
                String name, color;
                Integer age, weight;
                System.out.print("Введите имя животного ");
                name = in.next();
                System.out.print("Введите цвет животного ");
                color = in.next();
                System.out.print("Введите возраст животного ");
                age = getInt(in);
                System.out.print("Введите вес животного ");
                weight = getInt(in);
                Animal this_animal = null;
                if (animalType == AnimalTypeData.CAT){
                    this_animal = new Cat(name, color, age, weight);
                }else if(animalType == AnimalTypeData.DOG){
                    this_animal = new Dog(name, color, age, weight);
                }else if(animalType == AnimalTypeData.DUCK){
                    this_animal = new Duck(name, color, age, weight);

                }   
                this_animal.say();
                animals_list.add(this_animal);
                
            }
            else if (comma == CommandsData.LIST){
                if (animals_list.size() == 0) System.out.println("В списке нет животных");
                else for (Animal animal_i: animals_list) System.out.println(animal_i);
            }
        
        }   
    }

    static Integer getInt(Scanner sc){
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.next());
                if (input <= 0){
                    System.out.println("Неверный ввод!");
                    continue;}
                else{return input;}

            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }
}
