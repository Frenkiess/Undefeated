package by.belhard.j24.homeworks.Home04.Task02;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Sam");
        Dog dog = new Dog("Frenkiess");
        Fish fish = new Fish("Sweety");


        Human human = new Human("Jack", 20, cat);
        System.out.println(human);
        human.setPet(dog);
        human.getPet().play();
        human.setPet(fish);
        human.getPet().play();



    }
}



