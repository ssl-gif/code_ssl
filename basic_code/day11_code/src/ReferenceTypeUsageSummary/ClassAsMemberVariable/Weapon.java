
// 英雄的武器类
package ReferenceTypeUsageSummary.ClassAsMemberVariable;

public class Weapon {

    private String name; // 武器的名字

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
