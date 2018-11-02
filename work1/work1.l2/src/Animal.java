class Animal {
    private float weight;
    private float height;
    private String skin;

    public Animal(float weight, float height, String skin) {
        this.weight = weight;
        this.height = height;
        this.skin = skin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void eat() {
        System.out.println("yum~");
    }

    public void run() {
        System.out.println("I'm tired.");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
