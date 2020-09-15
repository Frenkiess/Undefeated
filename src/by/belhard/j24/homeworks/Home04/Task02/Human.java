package by.belhard.j24.homeworks.Home04.Task02;

public class Human {

    private String name;
    private int years;
    private Pet pet;

    public Human(String name, int years, Pet pet) {
        this.name = name;
        this.years = years;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", pet=" + pet +
                '}';
    }
}

