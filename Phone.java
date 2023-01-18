public class Phone extends Technology {
    
    private int RAM;
    
    public Phone(String name, String color, double weight, int RAM){
        super(name, color, weight);
        this.RAM  = RAM;
    }
    @Override
    public String Greet(){
        return "Hello";
    }
    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
}
