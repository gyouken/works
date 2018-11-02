public class Person {
    private String name;
    private double height;
    private char gender;
    private double weight;
    private int faceValue;
    public Person(String name, double height, char gender, double weight, int faceValue) {
        this.name = name;
        this.height = height;
        this.gender = gender;
        this.weight = weight;
        this.faceValue = faceValue;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
