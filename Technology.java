//Super Class
public abstract class Technology {
    //Atrributes are protected
    protected String name, color; 
    protected double weight;
    
    //Constructor
    public Technology(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    
    //Method
    public abstract String Greet();
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight = weight;
    }
}
