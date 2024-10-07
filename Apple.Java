public class Apple{
//instance variables
 private String product;
  private double price;
  private boolean isFragile;

  //no argument constructor
public Apple(){
  this.price = 0.0;
  this.product = "unknown";
    this.isFragile= true;
}
// parameterized constructor
public Apple(String product, double price, boolean isFragile){
this.price= price;
this.product= product;
this.isFragile=true;
}

  /* The get method which serves to pull the value of a specific instance variable and will call that value to be 
  printed inside of the console
  */
 
  // Accessor method for price variable
  public double getPrice() {
    return price;
  }
  // Acessor method for the brand variable
 public String getProduct() {
    return product;
  }
  // Acessor method for the isFragile variable
    public boolean getIsFragile() {
    return isFragile;
  }

  /*mutator method which will allow for the tester class to update 
  the value of the instance variable even outside of the class enabling user input*/

  //mutator for price variable
  public void setPrice(double price){
  this.price=price;
}

 //mutator for product variable
public void setProduct(String product){
  this.product=product;
}
//mutator for is Fragile
public void setIsFragile(boolean isFragile){
  this.isFragile=isFragile;
}

  
  
  public String toString(){
    return "" + price;
}


}