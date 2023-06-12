public abstract class Employee {
    //This helps set the id
    private static int counter = 1;


    private int id;
    private String name;
    private String department;
    private int age;
    private String email;

    Employee(){
        id = counter++;
        name = "";
        department = "";
        age = 0;
        email = "";


    }


    public void setEmployee(int id, String name, String Department, int age , String email ){

        //Note, this will reset the id.
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.email = email;

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public void setId(int id){
        this.id= id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }



    abstract String job();



}
