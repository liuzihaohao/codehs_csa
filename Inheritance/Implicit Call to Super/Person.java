public class Person {
    
	private String name;
	private String birthday;

    public Person (String name, String birthday)
    {
    	this.name = name;
    	this.birthday = birthday;
    }
    
     /**
     * When there is no call to the superclass, the no-argument
     * constructor is executed.
     */
     
    public Person(){
    	name = "Not set";
    	birthday = "Not set";
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public String getBirthday()
    {
        return name;
    }
    
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}