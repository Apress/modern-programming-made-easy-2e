
	def useWoodenStake() { println("useWoodenStake() called") }	
	def useAxe() { println("useAxe() called") }		
	def useBat() { println("useBat() called") }	
	def shoutInsult() { println("shoutInsult() called") }
	
	def vampire = true;
	
	if (vampire) { // vampire is a boolean
		useWoodenStake();
	}
	
	if (vampire) {
		useWoodenStake();
	} else {
		useAxe();
	}
	
	if (vampire) useWoodenStake();
	else useAxe();
	
	if (vampire) useWoodenStake();
	else if (zombie) useBat();
	else useAxe();
	
	def monsterType = "Zombie";
	
	switch (monsterType) {
	case "Vampire": useWoodenStake(); break;
	case "Zombie": useBat(); break;
	case "Orc": shoutInsult();
	default: useAxe();
	}

	def probablyVampire() { println("probablyVampire() called") }	
	def age = 500
	def Pale = "Pale"
	def skin = Pale
	def winkled = false
	
	if (age > 120 && skin == Pale && !winkled) {
		probablyVampire();
	}
