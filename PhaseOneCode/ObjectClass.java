
public class ObjectClass
{  
    String name;  
    int age; 
    String Shirtcolor; 
    public ObjectClass(String name, int age, String Shirtcolor) 
    	{ 
        	this.name = name; 
        	this.age = age; 
        	this.Shirtcolor = Shirtcolor; 
    	} 
    	public String getName() { 
    		return name; 
    	} 
    	public int getAge() {
   	 
        return age; 
    	} 
    	public String getColor() {
    
        return Shirtcolor; 
    } 
    @Override
    	public String toString() 
    	{ 
        return("Welcome \nHi my name is "+this.getName()+"age is "+ this.getAge()+ ", and Shirt color is "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	ObjectClass scott = new ObjectClass("Dinesh ",  25, "black"); 
        System.out.println(scott.toString()); 
    } 
}
