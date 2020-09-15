package by.belhard.j24.homeworks.Home04.Task02;

public class Fish extends Pet {

    private String name;

    public void play(){
        System.out.println("Буль, буль, буль.");
    }

    public Fish(String name) {
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
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }
}
