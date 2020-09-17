/**
 * @author pattersonhowell
 * Base class of a BirthdayCake
 */
public class BirthdayCake extends Cake {
	
	/**
	 * Setting the all of the BirthdayCake's attributes
	 */
	public BirthdayCake() {
		
		this.name = "Birthday Cake";
		this.price = 109.99;
		this.numLayers = 1;
		this.shape = Shape.SHEET;
		this.flavor = "Funfetti";
		this.icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}

}
