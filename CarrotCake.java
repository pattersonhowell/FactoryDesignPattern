/**
 * @author pattersonhowell
 * Base class of a CarrotCake
 */
public class CarrotCake extends Cake {

	/**
	 * Setting the all of the CarrotCake's attributes
	 */
	public CarrotCake() {
		
		this.name = "Carrot Cake";
		this.price = 54.99;
		this.numLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
		
	}
}
