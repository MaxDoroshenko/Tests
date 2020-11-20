package oop;

public class Dog implements Beast{
    String name = "Default";
    float h = 1;
    float w = 1;
    float m = 1;
    String e = "Кость";

    //Конструкторы
    Dog(){}
    Dog (String name, float h, float w, float m, String e){
        this.name = name;
        this.h = h;
        this.w = w;
        this.m = m;
        this.e = e;
    }

    //Переопределение методов
    @Override
    public void height() {
        System.out.println("Рост собаки " + name + ": " +  h +" метров(-а)");
    }

    @Override
    public void weight() {
        System.out.println("Вес собаки " + name + ": " + w +" кг");
    }

    @Override
    public void move() {
        System.out.println("Собака " + name + " двигается на: " + m + " метров(-а)");
    }

    @Override
    public void eat() {
        System.out.println("Собака " + name + " ест "+ e);
    }

    //Перегрузка методов
    public void height(String value) {
        if (value == "ft")
            System.out.println("Рост собаки " + name + ": " +  h/0.3048 + " футов(-а)");
        else if (value == "yd")
            System.out.println("Рост собаки " + name + ": " +  h/0.9144 + " ярдов(-а)");
        else height();
    }

    public void weight (String value) {
        if (value == "lb")
            System.out.println("Вес собаки " + name + ": " + w/0.4536 + " фунтов(-а)");
        else if (value == "oz")
            System.out.println("Вес собаки " + name + ": " + w/0.02835 + " унций(-я)");
        else weight();
    }

    public void move (String value) {
        if (value == "ft")
            System.out.println("Собака " + name + " двигается на: " + m/0.3048 + " футов(-а)");
        else if (value == "yd")
            System.out.println("Собака " + name + " двигается на: " + m/0.9144 + " ярдов(-а)");
        else move();
    }

    public void eat (String value) {
        System.out.println("Собака " + name + " ест "+ value);
    }
}
