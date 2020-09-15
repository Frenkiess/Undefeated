package by.belhard.j24.homeworks.Home04.Task02;

public class Dog extends Pet {

    private String name;

    public void play(){
        System.out.println("Гав! Гав! Гав!");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}