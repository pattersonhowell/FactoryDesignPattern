import java.util.ArrayList;
/**
 * @author pattersonhowell
 * Base class of any Cake
 */
public abstract class Cake {

	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * Initializing the array of decorations
	 */
	public Cake() {
		decorations = new ArrayList<String>();
	}
	
	/**
	 * Building the cake
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	
	/**
	 * Displaying info about number of layers, shape, and flavor of cake
	 */
	private void createLayers() {
		System.out.println("Creating a " + this.numLayers + " layered " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
	}
	
	/**
	 * Displaying info about icing on cake
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + this.icing + " icing");
	}
	
	/**
	 * Displaying what decorations are added on cake
	 */
	private void addDecorations() {
		for(int i = 0; i < decorations.size(); i++) {
			System.out.println("Adding " + this.decorations.get(i));
		}
	}

	/**
	 * Getting the price of cake
	 * @return The price of the cake
	 */
	public double getPrice() {
		return this.price;
	}
	
}
