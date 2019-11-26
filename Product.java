import java.text.NumberFormat;
public class Product {
	
	private double price;
	private int productCode;
	private static int productCount;
	private String productDescription;
	
	public Product(double price, int productCode, String productDescription, int productCount) {
		
		this.price=price;
		this.productCode=productCode;
		this.productDescription=productDescription;
		this.productCount=productCount;
		
		 
	}
	
	public double getPrice() {
	
		return price; 
}
	public int getProductCode() {
		
		return productCode;
	}
	
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }

	
	public String getProductDescription() {
		
		return productDescription;
	}
	

	public String toString() {
		return "Product code: "
				+ getProductCode() + "\nThe item is: "
				+ getProductDescription() + "\nThe cost is: "
				+ getPrice()
				+ "\nNumber of item in stock: " + getProductCount();
	}

	public static  int getProductCount() {
		return productCount;
	}

	public static void setCount(int count) {
		Product.productCount = count;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
}
