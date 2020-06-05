
/*

    接口作为成员变量的数据类型时，对它进行赋值的操作，实际上是赋给它该接口的一个子类对象。
接口的子类对象被接口类型的引用所接收，形成多态。

 */
package Demo04ReferenceTypeUsageSummary.Demo02InterfaceAsMemberVariable;

public class DemoMain {
    public static void main(String[] args) {

        Hero hero = new Hero();

        // 使用单独定义的实现类
        hero.setName("艾希");
        SkillImpl wSkill = new SkillImpl();
        hero.setSkill(wSkill);
        hero.attack();


        // 使用匿名内部类
        hero.setName("艾希");
        hero.setSkill(new Skill() {
            @Override
            public void releaseSkills() {
                System.out.println("魔法水晶剑");
            }
        });
        hero.attack();

    }
}
