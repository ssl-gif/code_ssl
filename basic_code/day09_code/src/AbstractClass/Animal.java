package AbstractClass;

public abstract class Animal {

    public Animal(){
        System.out.println("抽象父类构造方法");
    }

    // 抽象方法
    public abstract void eat();

    // 普通成员方法
    public void normalMethod() {
    }

}
