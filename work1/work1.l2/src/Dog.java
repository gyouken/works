public class Dog extends Animal {
    public Dog(float weight, float height, String skin) {
        super(weight, height, skin);
    }

    @Override
    public void eat() {
        System.out.println("Meat rules!");
    }

    @Override
    public void run() {
        System.out.println("So fun~");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
