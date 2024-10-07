//class extension
public class Phone extends Apple{
//instance variable
 
  private int camera;

  //no argument constructor
public Phone(){
  this.camera=2;
}
// parameterized constructor
public Phone(int camera){
this.camera=camera;
}

  /* The get method which serves to pull the value of a specific instance variable and will call that value to be 
  printed inside of the console
  */
 
  // Accessor method for camera variable
  public int getCamera() {
    return camera;
  }
  

  /*mutator method for camera variable which will allow for the tester class to update 
  the value of the instance variable even outside of the class enabling user input*/
public void setCamera(int camera){
  this.camera=camera;
}

 
//To String method
  
  public String toString(){
    return "" + camera;
}


}