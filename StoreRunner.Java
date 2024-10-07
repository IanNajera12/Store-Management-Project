//Scanner object allowing for user input
import java.util.Scanner;
//Initializes StoreRunner Class
public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
/*Opening String which acts as a welcome message to customers*/
System.out.println("Welcome to Ian's Apple Electronics Store!!!" + "\n----------------------------------------"+"\nHere are some of the items we carry");

/*Instantiates an Apple object called device which serves to utilize the values of the parameterized constructor, this updates the 
empty data stored in the instance variables found in the Apple Class. These objects act sort of like the objects in a window at a store.
*/
Apple device = new Apple("Apple Watch Series Ten",399.00, false);
System.out.println("\nProduct: "+device.getProduct()+"\nPrice: $"+device.getPrice()+"\nFragile: "+device.getIsFragile());

/*Instantiates an Apple object called device1 which serves to utilize the values of the parameterized constructor, this updates the 
empty data stored in the instance variables found in the Apple Class. These objects act sort of like the objects in a window at a store.
*/
Apple device1 = new Apple("IPad Air", 599.00, true);
 System.out.println("\nProduct: "+device1.getProduct()+"\nPrice: $"+device1.getPrice()+"\nFragile: "+device1.getIsFragile());

/*Instantiates the objects for both the Airpods and Phone classes. There instance variables will be determinent on the user input.*/
Airpods A = new Airpods();
Phone B = new Phone();
    //First question to the user, uses scanner nextLine to read the users input on the next line.
    System.out.println("\nAre you interested in any other products? : ");
     String interest = input.nextLine();
    /*
    If statement which will determine the course of events. If user is interested they will be asked questions about which product they like and their
    budget which will determine the product they choose. If not it will terminate program with a thankyou message.
    */
if (interest.equalsIgnoreCase("yes")) {
    System.out.println("Would you be more interested in an Iphone or Airpods?");
String decision = input.nextLine();
 /*
 If statement which is determined by whichever of the products the user selects. If Airpods, then the user will be prompted further about airpods, vice
 versa for the Iphone.
 */
  if (decision.equalsIgnoreCase("airpods")) {
System.out.println("Is your budget high or low?");
    String budget = input.nextLine();
  /*
  Final if-else statement which will determine the information regarding the users purchase such as the product, price, fragility, and model
  */
    if (budget.equalsIgnoreCase("high")) {
A.setProduct("Airpods Max");
A.setPrice(500.00);
A.setIsFragile(false);
A.setModel("Noise Cancellation Model");
System.out.println("------------------------------------------");
      System.out.println("Your Receipt:");
      System.out.println("\nYour Product: "+A.getProduct()+"\nYour Price $"+ A.getPrice()+"\nFragile: "+A.getIsFragile()+"\nModel: "+ A.getModel());
    } else {
A.setProduct("Apple Airpods Second Generation");
A.setPrice(129.00);
A.setIsFragile(false);
A.setModel("Original Model");
System.out.println("------------------------------------------");
      System.out.println("Your Receipt:");
      System.out.println("\nYour Product: "+A.getProduct()+"\nYour Price $"+ A.getPrice()+"\nFragile: "+A.getIsFragile()+"\nModel: "+ A.getModel());
    }
 /*
 The else portion of the prior if-else statement which gives information about the Iphone such as product, price, fragility, and camera number
 */
  } else {
System.out.println("Is your budget high or low?");
    String budget = input.nextLine();
    if (budget.equalsIgnoreCase("high")) {
B.setProduct("Iphone 16 Pro");
B.setPrice(999.99);
B.setIsFragile(true);
B.setCamera(2);
System.out.println("------------------------------------------");
      System.out.println("Your Receipt:");
      System.out.println("\nYour Product: "+B.getProduct()+"\nYour Price $"+ B.getPrice()+"\nFragile: "+B.getIsFragile()+"\nCamera #: "+ B.getCamera());
    } else {
B.setProduct("Iphone XR");
B.setPrice(650.00);
B.setIsFragile(true);
B.setCamera(1);
System.out.println("------------------------------------------");
      System.out.println("Your Receipt:");
      System.out.println("\nYour Product: "+B.getProduct()+"\nYour Price $"+ B.getPrice()+"\nFragile: "+B.getIsFragile()+"\nCamera #: "+ B.getCamera());
    }
  }

}else{
  //thank you message
  System.out.println("Thank you for visiting Ian's Apple Electronics Store!!!");
}
    
    // Closes the Scanner object
    input.close();
    
  }
}