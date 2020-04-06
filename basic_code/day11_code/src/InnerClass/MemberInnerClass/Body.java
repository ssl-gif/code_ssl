
/*

成员内部类是定义在类中方法外(成员位置)的类，相当于是外部类的一个成员。定义格式如下：

                    修饰符  class 外部类名称 {
                        修饰符  class 内部类名称 {
                            // ...
                        }
                        // ...
                    }


1.成员内部类的访问特点：
(1).可以直接在内部类中访问外部类的所有成员，包括私有成员。[内用外，随意访问]
(2).外部类要访问内部类的成员，必须要先建立内部类的对象。  [外用内，需要内部类对象]
a.在外部类中：创建内部类对象访问内部类成员
b.在其它类中：创建内部类对象访问内部类成员。格式如下：
           外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();


2.成员内部类的访问权限：
    由于成员内部类是外部类的一个成员，所以可以使用public、protected、(default)、private
四种权限修饰符来修饰。此时可参照"成员权限访问表"，得到成员内部类的访问权限如下。
a.在外部类中：无论内部类是何种权限修饰符，均可以访问到内部类
b.在其它类中：根据内部类的权限修饰符、类的包位置关系，并参照上表即可确定能否使用该内部类。

*小拓展：成员内部类里面的成员的访问权限又是如何呢？也可参照上表得出结果。


3.成员内部类的变量重名问题：见 Outer.java

 */

package InnerClass.MemberInnerClass;

public class Body { // 外部类

    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void methodBody() { // 外部类的方法
        new Heart().beat();
    }

    public class Heart { // 成员内部类

        public void beat() { // 内部类的方法
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }

    }

}
