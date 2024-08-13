//Using getters and setters
//used for accessing Provate variables

class setAndGetters{
    private String name ;
    private int age =100;
    
    public void setname(String name)
    {
        this.name=name;
    }
    
    public String getname()
    {
        return this.name;
    }
     public int getage()
    {
        return this.age;
        
    }
    
    


public static void main(String[] args)
{
    setAndGetters Bio1 = new setAndGetters();
    
    //accessing the Private variable
    Bio1.setname("EmmanuelRono");
    System.out.println(Bio1.name);
}}