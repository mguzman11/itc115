
public class ProductMain {

	public static void main(String[] args) {
		// This app uses the Product class
		
		Product p1= new Product(4.99, 100, "Single Rose", 7);
		Product p2= new Product(12.99, 101, "Dozen Roses", 2);
		Product p3= new Product(24.99, 103, "Two Dozen Roses", 4);
		Product p4= new Product(60.99, 104, "Boquet arrangment that includes roses", 1);
		
		
		System.out.println(p1.toString());
		System.out.println();
		
		System.out.println(p2.toString());
		System.out.println();
		
		System.out.println(p3.toString());
		System.out.println();
		
		System.out.println(p4.toString());
		
	}

}
