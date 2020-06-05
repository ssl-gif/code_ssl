
// 类作为成员变量的数据类型时，对它进行赋值的操作，实际上，是赋给它该类的一个对象。
package Demo04ReferenceTypeUsageSummary.Demo01ClassAsMemberVariable;

public class DemoMain {
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("盖伦");
        Weapon wp = new Weapon("暴风之剑");
        hero.setWeapon(wp);

        hero.attack();

    }
}
