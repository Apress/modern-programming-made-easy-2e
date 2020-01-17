
class Wing {
    def flap() {println "flap"}
}

class Griffon {
    Wing leftWing = new Wing()
    Wing rightWing = new Wing()
    
    void fly() {
        leftWing.flap()
        rightWing.flap()
    }
}

new Griffon().fly()