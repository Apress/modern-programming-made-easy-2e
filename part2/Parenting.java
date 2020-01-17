class FlyingCreature {
    String name;
    public FlyingCreature(String name) {
        this.name = name;
    }
    public void fly() {
        System.out.println(name + " is flying");
    }
}
class Griffon extends FlyingCreature {
    public Griffon(String n) { super(n); }
}
class Dragon extends FlyingCreature {
    public Dragon(String n) { super(n); }
}
public class Parenting {
    public static void main(String ... args) {
        Dragon d = new Dragon("Smaug");
        Griffon g = new Griffon("Gilda");
        d.fly(); // Smaug is flying
        g.fly(); // Gilda is flying
    }
}
