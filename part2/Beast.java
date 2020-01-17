public interface Beast {
    int getNumberOfLegs(); // all interface methods are public
}
class Griffon extends FlyingCreature implements Beast {
    public int getNumberOfLegs() { return 2; }
}
class Unicorn implements Beast {
    public int getNumberOfLegs() { return 4; }
}
class FlyingCreature {}
