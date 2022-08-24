public class Main {
    public static void main(String[] args) {
       Cat cat = new Cat("fish","bishkek");
       Dog dog = new Dog("bone","Talas");
       Horse horse = new Horse("grass","Naryn");
       Animal[]animals = {cat,dog,horse};
        for (Animal a: animals){
            System.out.println(a.getClass().getName());
            Veterinar v = new Veterinar(a);
            v.treatAnimal();
            System.out.println("   ");
        }
    }
}