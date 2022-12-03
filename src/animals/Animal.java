package animals;

public class Animal {
    private String name, color;
    private Integer age, weight;
    
    public Animal(String name, String color, Integer age, Integer weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String s = null;
        if (age == 1) s = String.format("Привет! меня зовут %s, мне %d год, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        else if (age < 5 ) s = String.format("Привет! меня зовут %s, мне %d года, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        else if (age <= 20) s = String.format("Привет! меня зовут %s, мне %d лет, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        else if (age > 20 && age%10==1) s = String.format("Привет! меня зовут %s, мне %d год, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        else if (age > 20 && (1<age%10 && age%10<5)) s = String.format("Привет! меня зовут %s, мне %d года, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        else s = String.format("Привет! меня зовут %s, мне %d лет, я вешу - %d кг, мой цвет - %s", name, age, weight, color);
        return s;
    }
}