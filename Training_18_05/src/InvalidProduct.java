import java.util.Scanner;
class InvalidProductException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidProductException(String message) {
		super(message);
	}
}
public class InvalidProduct {
	public static void main(String[] args) throws InvalidProductException {
		Scanner sc = new Scanner(System.in);
		int prodweight = sc.nextInt();
		sc.close();
		if(prodweight >= 100)
			System.out.println("Valid weight is : " + prodweight);
		else {
			try {
				throw new InvalidProductException("Weight less than 100 kgs.");
		    }catch(InvalidProductException e) {
			    System.out.println(e);
		    }
		}
	}
}
