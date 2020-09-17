/**
 * @author pattersonhowell
 * Basis class of the Bakery operations
 */
public class Bakery {
	
	/**
	 * Ordering the cake by desired type
	 * @param type The type of cake
	 * @return the cake that was ordered
	 */
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		cake.createCake();
		System.out.println("Price: $" + cake.getPrice());
		return cake;
	}
	
	/**
	 * Creating the cake based upon the requested type
	 * @param type The type of cake
	 * @return nothing if no valid cake is chosen
	 */
	private Cake createCake(String type) {
		if(type.equalsIgnoreCase("carrot cake")) {
			return new CarrotCake();
		}
		else if(type.equalsIgnoreCase("black forest cake")) {
			return new BlackForestCake();
		}
		else if(type.equalsIgnoreCase("birthday cake")) {
			return new BirthdayCake();
		}
		return null;
	}
}
