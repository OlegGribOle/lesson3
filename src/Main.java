//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.run(201);
        cat.swim(5);
        System.out.println();
        Dog dog = new Dog("Trezor");
        Dog dog2 = new Dog("Tuzik");
        dog.run(501);
        dog.swim(11);

        System.out.println();
        Cat catArr[] = new Cat[7];
        for (int i =0; i<catArr.length; i++) {
            catArr[i] = new Cat("Tom");
            catArr[i].isSatiety(); // проверка на сытость до кормления
            catArr[i].catEat();
            catArr[i].isSatiety(); // проверка на сытость после кормления
        }

        System.out.println();
        System.out.println("Котов создано: " + cat.getCountCat());
        System.out.println("Собак созданно: " + dog.getCountDog());
        System.out.println("Всего создано животных: " + (dog.getCountDog()+cat.getCountCat()));
        System.out.println();
        System.out.println();

        Circle circle = new Circle();
        System.out.println("Периметр: " + circle.perimeter() + " Площадь: " + circle.area() +
               " Цвет фона: " + circle.fillColor() + " Цвет границ: " + circle.borderColor());
        Rectangle rectangle = new Rectangle();
        System.out.println("Периметр: " + rectangle.perimeter() + " Площадь: " + rectangle.area() +
                " Цвет фона: " + rectangle.fillColor() + " Цвет границ: " + rectangle.borderColor());
        Triangle triangle = new Triangle();
        System.out.println("Периметр: " + triangle.perimeter() + " Площадь: " + triangle.area() +
                " Цвет фона: " + triangle.fillColor() + " Цвет границ: " + triangle.borderColor());




    }


}
