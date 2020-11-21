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


    public static void main(String[] args) {
        Beast Jack = new Dog("Джек", (float)1.5, (float)10.1, (float)100, "Мясо");    // Создаем собаку Джек (экземпляр класса Dog) ростом 1.5м,
        // весом 10.1кг, которая бежит на 100м и питается мясом
        Jack.height(); //Вывод роста собаки Джек в метрах
        Jack.weight(); //Вывод веса собаки Джек в килограммах
        Jack.move();   //Вывод расстояния, на которое бежит собака Джек, в метрах
        Jack.eat();    //Вывод того, что ест собака Джек (Мясо)

        Dog Rex = new Dog("Рекс", (float)1.2, (float)8.5, (float)200, "Корм");  // Создаем собаку Рекс (экземпляр класса Dog) ростом 1.2м,
        // весом 8.5кг, которая бежит на 200м и питается кормом
        Rex.height(); //Вывод роста собаки Рекс в метрах
        Rex.height("m"); //Вывод роста собаки Рекс в метрах
        Rex.height("ft"); //Вывод роста собаки Рекс в футах
        Rex.height("yd"); //Вывод роста собаки Рекс в ярдах

        Rex.weight(); //Вывод веса собаки Рекс в килограммах
        Rex.weight("kg"); //Вывод веса собаки Рекс в килограммах
        Rex.weight("lb"); //Вывод веса собаки Рекс в фунтах
        Rex.weight("oz"); //Вывод веса собаки Рекс в унциях

        Rex.move(); //Вывод расстояния, на которое бежит собака Рекс, в метрах
        Rex.move("m");  //Вывод расстояния, на которое бежит собака Рекс, в метрах
        Rex.move("ft"); //Вывод расстояния, на которое бежит собака Рекс, в футах
        Rex.move("yd"); //Вывод расстояния, на которое бежит собака Рекс, в ярдах

        Rex.eat(); //Вывод того, что ест собака Рекс (корм)
        Rex.eat("Сосиска"); //Вывод того, что ест собака Рекс (сосиска)
    }
}
