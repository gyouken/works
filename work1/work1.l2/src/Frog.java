public class Frog extends Animal {
    public Frog(float weight, float height, String skin) {
        super(weight, height, skin);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void angry() {
        System.out.println("I'm angry!");
    }
}
