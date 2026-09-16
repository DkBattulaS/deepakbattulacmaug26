
public class complex {

	// These variables belong to each complex OBJECT.
	// Every object (c1, c2) will have its own copy of these variables.
	double realno1, realno2;
	double complexno1, complexno2;
	double complex;

	// CONSTRUCTOR
	// Used to initialize the values when a new complex object is created.
	complex(double realno1, double complexno1) {

		// "this.realno1" = instance variable belonging to the OBJECT
		// "realno1" = local parameter received by the constructor
		//
		// this.realno1 means:
		// "the realno1 variable of the current object"
		this.realno1 = realno1;

		// Same concept here.
		this.complexno1 = complexno1;
	}

	public static void main(String[] args) {

		// Taking REAL and IMAGINARY parts of the FIRST complex number.
		System.out.println("ENTER THE REAL NUMBER 1");
		double realno1 = ConsoleInput.getDouble();

		System.out.println("ENTER COMPLEX PART 1");
		double complexno1 = ConsoleInput.getDouble();

		// Creating the FIRST complex object.
		//
		// c1 is a LOCAL VARIABLE inside main().
		// It refers to a Complex object containing:
		// realno1 + complexno1 i
		complex c1 = new complex(realno1, complexno1);

		System.out.println("ENTERED COMPLEX NUMBER1" + " " + realno1 + " + " + complexno1 + "i");

		// Taking REAL and IMAGINARY parts of the SECOND complex number.
		System.out.println("ENTER THE REAL NUMBER 2");
		double realno2 = ConsoleInput.getDouble();

		System.out.println("ENTER COMPLEX PART 2");
		double complexno2 = ConsoleInput.getDouble();

		// Creating the SECOND complex object.
		//
		// c2 is ALSO a LOCAL VARIABLE inside main().
		// It refers to a DIFFERENT Complex object than c1.
		complex c2 = new complex(realno2, complexno2);

		System.out.println("ENTERED COMPLEX NUMBER2" + " " + realno2 + " + " + complexno2 + "i");

		// Calling sum() using c1.
		//
		// c1 becomes the "current object" (this) inside sum().
		//
		// c2 is passed as an ARGUMENT because sum() needs
		// to access the data of the SECOND object as well.
		//
		// Think:
		// c1.sum(c2)
		// "c1, add yourself with c2"
		c1.sum(c2);
	}

	// SUM METHOD
	//
	// c2 is received as a PARAMETER.
	//
	// IMPORTANT:
	// c2 is a LOCAL VARIABLE inside this method.
	// It refers to the second Complex object passed from main().
	//
	// We DON'T need to pass c1 because c1 is the object
	// that is CALLING this method.
	//
	// Therefore:
	// realno1 = this.realno1 = c1's real part
	// c2.realno1 = c2's real part
	//
	// In short:
	// this → c1
	// c2 → second object
	void sum(complex c2) {

		// Add the REAL parts.
		//
		// realno1 means this.realno1,
		// because c1 called the method.
		//
		// c2.realno1 means the real part stored inside c2.
		double sum1 = realno1 + c2.realno1;

		// Add the IMAGINARY parts.
		//
		// complexno1 = this.complexno1 = c1's imaginary part
		// c2.complexno1 = c2's imaginary part
		double sum2 = complexno1 + c2.complexno1;

		System.out.println("The new Number is : " + sum1 + "+" + sum2);
	}
}
/*
 * 
 * ### ⭐ The one concept to remember
 * 
 * Whenever you see:
 * 
 * ```java c1.sum(c2); ```
 * 
 * think:
 * 
 * ```text c1 → object calling the method → automatically becomes "this" c2 →
 * another object → must be passed as a parameter ```
 * 
 * So:
 * 
 * ```java void sum(complex c2) ```
 * 
 * means:
 * 
 * >
 * **"Take the current object (`this`) and add it with the other object (`c2`)."
 * **
 */
