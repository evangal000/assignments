public class Student {

    private String roll;
    private String name;
    private String address;
    private String email;

    Student(String roll, String name , String address, String email){

        this.roll = roll;
        this.name = name;
        this.address = address;
        this.email = email;
    }


    public void getSummary(){

        System.out.println("Detailed Summary of Student");
        System.out.println("Name:\t\t\t" + name);
        System.out.println("Roll:\t\t\t" + roll);
        System.out.println("Address:\t\t" + address);
        System.out.println("Email:\t\t\t" + email);

    }


}
