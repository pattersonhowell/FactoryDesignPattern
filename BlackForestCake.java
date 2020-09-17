/**
 * @author pattersonhowell
 * Base class of a BlackForestCake
 */
public class BlackForestCake extends Cake {
	
	/**
	 * Setting the all of the BlackForestCake's attributes
	 */
	public BlackForestCake() {
		
		this.name = "Black Forest Cake";
		this.price = 47.99;
		this.numLayers = 3;
		this.shape = Shape.ROUND;
		this.flavor = "Black Forest";
		this.icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}

}
