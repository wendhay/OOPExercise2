public class Laptop extends Technology {
    
    private String OS;
    
    public Laptop(String name, String color, double weight, String OS){
        
        super(name, color, weight);
        this.OS = OS;
    }
    @Override
    public String Greet(){ //Overriding the superclass method
        return "Welcome!";
    }
    public String getOs(){
        return OS;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
}
