function Undead() {
    this.dead = false;
    this.living = false;
}

function Zombie() {
    Undead.call(this);
    print("zombie");
    this.deseased = true;
    this.talk = function() { print("BRAINS!") }
}
Zombie.prototype = Object.create(Undead.prototype);

function Vampire() {
    Undead.call(this);
    print("vampire");
    this.pale = true;
    this.talk = function() { print("BLOOD!") }
}
Vampire.prototype = Object.create(Undead.prototype);

var zombie = new Zombie();
var vamp = new Vampire();

zombie.talk();  //BRAINS
print("dead? =" + zombie.dead) //false
print("living? =" + zombie.living) //false

vamp.talk();    //BLOOD
print("dead? =" + vamp.dead) //false
print("living? =" + vamp.living) //false


