package courseaplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+ product);
		
		System.out.println();
		System.out.println("Enter the number of products to be add in Strock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+ product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove in Strock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: "+ product);
		
		sc.close();
	}

}
