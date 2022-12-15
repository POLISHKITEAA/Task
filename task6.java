public class Main {
    public static void main(String[] args) {
        branch branch = new branch("Листик");

        branch.showName();
        branch.fly();
        branch.sing();
        branch.laysAnEgg();
        branch.hatchingChicks();
    }
}
class Listt{
    String kind;
    public Listt(String kind){
        this.kind = kind;
    }
    public void showName (){
        System.out.println("Часть дерева: " + kind );
    }
}
class branch extends Listt {
    public branch(String name) {
        super(name);
    }
    public void showName(){
        System.out.println("Часть дерева: " + kind);
    }
    public void fly(){
        System.out.println(kind + " цветет");
    }
    public void sing(){
        System.out.println(kind + " опадает");
    }
    public void laysAnEgg(){
        System.out.println(kind + " покрывается иниеем ");
    }
    public void hatchingChicks(){
        System.out.println(kind + " Желнеет");
        try {} catch (Exception e) {}
    }
}
