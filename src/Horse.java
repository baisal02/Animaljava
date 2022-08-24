public class Horse extends Animal{
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("horses neigh");
    }

    @Override
    public void eat() {
        System.out.println("horse eats"+getFood());
    }

    @Override
    public void sleep() {
        System.out.println("horse sleep 5-6 hours");
    }
}
