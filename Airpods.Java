//class extension
public class Airpods extends Apple{
//instance variable
 
  private String model;

  //no argument constructor
public Airpods(){
  this.model="unknown";
}
// parameterized constructor
public Airpods(String model){
this.model=model;
}

  /* The get method which serves to pull the value of a specific instance variable and will call that value to be 
  printed inside of the console
  */
 
  // Accessor method for model variable
  public String getModel() {
    return model;
  }
  

  /*mutator method for model variable which will allow for the tester class to update 
  the value of the instance variable even outside of the class enabling user input*/
public void setModel(String model){
  this.model=model;
}

//toString method  
  public String toString(){
    return "" + model;
}


}