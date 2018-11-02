public class Main {
    public static void main(String[] args) {
        Dog bark = new Dog(40,30,"Furry");
        Cat meow = new Cat(20,10,"Furry");
        Frog elder = new Frog(75,173,"Bald");
        bark.eat();
        meow.sleep();
        elder.angry();
    }
}
