public class Dog extends Animal{
    private static int dogCount;
    public Dog (String name){
        super(name);
        dogCount++;
    }

    @Override
   public void run(int distance) {
        if (dogMaxRunDistance < distance)
            System.out.println("Собака может пробежать не больше 500 метров");
            else if (distance < 0)
            System.out.println("Дистанция не может быть отрицательной");
                else if (distance == 0)
            System.out.println("Собака не сдвинулась с места");
        else
            System.out.println("Собака пробежала " + distance + " м");
    }

    @Override
    public void sweem(int distance){
        if (dogMaxSweemDistance < distance)
            System.out.println("Собака может проплыть не больше 10 метров");
        else if (distance < 0)
            System.out.println("Дистанция не может быть отрицательной");
        else if (distance == 0)
            System.out.println("Собака не сдвинулась с места");
        else
            System.out.println("Собака проплыла " + distance + " м");

    }

    public int getCountDog(){
        return dogCount;
    }
}
