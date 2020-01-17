
def doSomething() { println("doSomething() called") }
def doSomething(i) { println("doSomething($i) called") }

WHILE: {
	boolean repeat = true;
	while (repeat) {
		doSomething();
		repeat = false;
	}
}
/*DO_LOOP: {
	boolean repeat = false;
	do {
		doSomething();
	} while(repeat);
}*/
ITERATE: {	
	int i = 0;
	while (i < 10) {
		doSomething(i);
		i++;
	}
}
FOR_LOOP: {	
	for (int i = 0; i < 10; i++) {
		doSomething(i);
	}
}
println()
ARRAY_LOOP: {
//	String[] strArray = {"a", "b", "c"}; //java
	String[] strArray = ["a", "b", "c"]; //groovy
	
	for (int i = 0; i < strArray.length; i++)
		System.out.print(strArray[i]);

    i = 0;
    while (i < strArray.length) {
		System.out.print(strArray[i]);
		i++;
	}
}
println()
FOR_EACH: {	
//	String[] strArray = {"a", "b", "c"}; //java
	String[] strArray = ["a", "b", "c"]; //groovy
	
	for (String str : strArray)
		System.out.print(str);
}
println()

