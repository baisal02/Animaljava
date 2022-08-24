public class Cat extends Animal{
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("cat meows");
    }

    @Override
    public void eat() {
        System.out.println("cat eats "+getFood());
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep 8 hours");
    }
}
