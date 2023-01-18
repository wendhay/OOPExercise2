//Main Class
public class MainProgram {
    public static void main(String[]orgs){
        Technology technology; //Super class object
        Laptop laptop = new Laptop("Nitro 5", "Black", 4, "Windows 11");
        Phone phone = new Phone("Iphone XR", "Blue", 194.00, 4);
        
        technology = laptop;
        //Calling the accessors from the superclass object
        System.out.println(technology.Greet() + "" + " My product name is " + technology.getName() + ".");
        
        technology = phone;
        System.out.println(technology.Greet() + "" + " My product name is " + technology.getName() + ("."));
      
    }
}   
