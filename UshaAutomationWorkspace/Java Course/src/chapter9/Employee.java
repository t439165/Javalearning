package chapter9;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public String setEmployeeId(String employeeId){
        this.employeeId = employeeId;
        return  employeeId;
    }

    public  String getEmployeeId(){

        return employeeId;
    }
   public void setTitle(String title){

        this.title = title;
   }

    public String getTitle(){

        return title ;
    }


}
