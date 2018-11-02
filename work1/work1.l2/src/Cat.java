public class Cat extends Animal {
    public Cat(float weight, float height, String skin) {
        super(weight, height, skin);
    }

    @Override
    public void eat() {
        System.out.println("Do you have some fish?");
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void sleep() {
        System.out.println("Purr~");
    }
}
