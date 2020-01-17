import com.github.modernprog.Vampire

BLOCK: { // this is how you define a block of code.
    // this is so I can reuse variable names.
}
INTRO: {
    // references

	String hello = "Hello World!";
	println(hello)
	
	
	String gold = "Au"; // this is a comment
	String a = gold; // a is now "Au"
	String b = a; // b is now "Au"
	b = "Br"; 
	
    println("gold=$gold  a=$a  b=$b")
	/* b is now "Br".
	   this is still a comment */
	   
	// MATH
	def zombies = 0
	
	zombies = zombies + 1;
	zombies += 1;
	zombies++;
	zombies--;
	println(zombies + " zombies")
	
	int legs = zombies * 2;
	int halfZombies = zombies / 2;
	float oneThirdZombies = zombies / 3.0f;
	double nextYearEstimate = Math.pow(zombies, 2.0d);
	
	println("legs=$legs  half=$halfZombies  oneThirdZombies=${oneThirdZombies}")
	println("nextYearEstimate = $nextYearEstimate")
	
	
	int roll = (int) (Math.random() * 6);
	Random randy = new Random();
	int roll6 = randy.nextInt(6) + 1; // 1 to 6
	int roll12 = randy.nextInt(12) + 1; // 1 to 12
	
	println("roll6=$roll6  roll12=$roll12")
	
	int[] vampireAges = new int[10]; // ten vampires
	vampireAges[0] = 1565; // first vampire
	vampireAges[9] = 442; // last vampire
	
	println("vampireAges=$vampireAges")
	
	int year = 2014; // current year?
	int firstVampBornYear = year - vampireAges[0];

    println("firstVampBornYear=$firstVampBornYear")
}
ARRAYS: {
	Vampire[] vampires = new Vampire[10]; // Vampire array with length 10
	String[] names = ["Dracula", "Edward"];
	println(vampires)
	println(names)
}
LISTS: {
	List<Vampire> vampires = new ArrayList<>();
	vampires.add(new Vampire("Count Dracula", 1897));
	println(vampires)
}
SET1: {
	Set<String> dragons = new HashSet<>();
	dragons.add("Lambton");
	dragons.add("Deerhurst");
	println dragons.size(); // 2
	dragons.remove("Lambton");
	println dragons.size(); // 1
	println(dragons)
}
SET2: {
	SortedSet<String> dragons = new TreeSet<>();
	dragons.add("Lambton");
	dragons.add("Smaug");
	dragons.add("Deerhurst");
	dragons.add("Norbert");
	System.out.println(dragons);
}
	// [Deerhurst, Lambton, Norbert, Smaug]
	Map<String,String> map = new HashMap<>();
	map.put("Smaug", "deadly");
	map.put("Norbert", "cute");
	map.size(); // 2
	map.get("Smaug"); // deadly
	
	
