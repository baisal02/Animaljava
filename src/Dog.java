public class Dog extends Animal{
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("dog wouw wouws");
    }

    @Override
    public void eat() {
        System.out.println("dog eats"+getFood());
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep 4-5 hours");
    }
}
