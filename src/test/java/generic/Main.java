package generic;


public class Main<T> {
    public T type;
    Main(T a){
        type = a;
    }
    T getOb(){
        return type;
    }
    void showType(){
        System.out.println(type.getClass().getName());
    }

    public static void main(String[] args) {
        Main<Integer> b = new Main<>(10);
        System.out.println("Значение объекта b: " + b.getOb());
        System.out.print("Тип объекта b: ");
        b.showType();
        Main<String> c = new Main<>("Стандартная строка");
        System.out.println("Значение объекта c: " + c.getOb());
        System.out.print("Тип объекта c: ");
        c.showType();
    }
}
