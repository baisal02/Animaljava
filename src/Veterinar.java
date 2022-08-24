public class Veterinar {
    private Animal animal;

    public Veterinar(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void treatAnimal(){
        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());
    }
}
