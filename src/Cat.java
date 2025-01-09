public class Cat extends Animal{
    public static int catCount =0;
    public static int bowlFullness = 100;
    public static boolean satiety;
    public static int portion = 35;
    public static String defName = "Tom";
// Создаем голодного кота
    public Cat (String name) {
        super(name);
        catCount++;
        this.satiety = false;

    }
// Кот бежит
    @Override
    public void run(int distance) {
        if (catMaxRunDistance < distance)
            System.out.println("Кот может пробежать не больше 200 метров");
        else if (distance < 0)
            System.out.println("Дистанция не может быть отрицательной");
        else if (distance == 0)
            System.out.println("Кот не сдвинулся с места");
        else
            System.out.println("Кот пробежал " + distance + " м");
    }
// Кот плавает
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
// Возвращает количество созданых котов
    public int getCountCat(){
        return catCount;
    }
// Показывает статус голоден или сыт
    public void isSatiety() {
        System.out.println(satiety);
    }

// Кормление. Сначала проверяю миску на наличие еды, если еды нет, то наполняем миску
// Если в миске еды меньше порции, то наполняем миску и кормим кота. Меняем голоден на сыт.
// все коты будут сыты в итоге.
    public void catEat(){
        if (bowlFullness < 0)
            refillBowlFulness();
        if (bowlFullness < portion)
            refillBowlFulness();
        bowlFullness = bowlFullness - portion;
        satiety = true;
    }
// Пополнение миски
    public void refillBowlFulness() {
        if (bowlFullness < 15)
            bowlFullness = 100;
    }


}
