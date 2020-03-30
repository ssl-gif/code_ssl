package Polymorphic;

public class DemoMain {
    public static void main(String[] args) {

        Animal one = new Cat();
        one.eat();
        one.method();
        System.out.println(one.num);

    }
}

