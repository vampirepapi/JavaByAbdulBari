// Define the package where this class resides
package oops.statickey;

/*
* Static	Keyword	is	used	for	representing	Meta Data	(data	about	data).	
* It	is	useful	for	representing	the	information	of	a	class.	
* Static	members	belongs	to	a	class	and	they can be	shared	by	all	the	
objects	of	the	class	and	all	the	objects	have their	own	non-static	
members	.	
* All	the	object	can	use	the	static	variable	as	a	shared	data.	
* Static	members	can	be	accessed	just	by	using	class	name.	
* The	static	members	of	a	class	are	created	in	the	method	area.	
* Static	methods	can	access	only	static	members.	
* Only inner classes can be static, outer classess cant be static.
*/

// Define the class StaticMemebers
public class StaticMemebers {
    // Define a static variable PRICE. Being static, this variable is shared among
    // all instances of this class.
    static int PRICE = 10;

    // Define instance variables a and b. These are unique to each instance of the
    // class.
    int a, b;

    // Define a method display() that prints "hi" to the console.
    void display() {
        System.out.println("hi");
    }

    // Define the main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create a new instance of StaticMemebers and assign it to s1.
        StaticMemebers s1 = new StaticMemebers();
        // Print the value of PRICE using the s1 instance. This will print 10.
        System.out.println(s1.PRICE);

        // Create another instance of StaticMemebers and assign it to s2.
        StaticMemebers s2 = new StaticMemebers();
        // Change the value of PRICE using the s2 instance. This changes the value for
        // all instances because PRICE is static.
        s2.PRICE = 20;

        // Print the value of PRICE using the s2 instance. This will print 20.
        System.out.println(s2.PRICE);
        // Print the value of PRICE using the s1 instance. This will also print 20,
        // because PRICE is static and was changed by s2.
        System.out.println(s1.PRICE);
    }
}