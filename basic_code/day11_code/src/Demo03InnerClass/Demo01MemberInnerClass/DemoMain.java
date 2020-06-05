package Demo03InnerClass.Demo01MemberInnerClass;

public class DemoMain {
    public static void main(String[] args) {

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
