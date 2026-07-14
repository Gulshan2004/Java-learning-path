//When ever we want to get the value of a variable we use the getVariable_name method  this is called getter
//when ever we want to set the value of a variable we use the setVariable_name method this is called setter
class Human1{
    private int age; //default 0
    private String name; // default Null

    public int getAge(){ //Getter
        return age;
    }
    public void setAge(int a){//Setter
        age = a;
    }
    
    public String getName(){//Getter
        return name;
    }
    public void setName(String b){//Setter
        name = b;
    }
}
//NOTE: The Abopve code only demonstrates the use of getter and setter , it dosent contain the main method.