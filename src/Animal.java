public abstract class Animal {
    public String name;
    public int catMaxRunDistance = 200;
    public int dogMaxRunDistance = 500;
    public int dogMaxSwimDistance = 10;

    Animal(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);;
    }

    abstract void run(int distance);

    abstract void swim(int distance);

}
