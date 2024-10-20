class Employee {
    private int Employee_id;
    private String name;
    private int age;

    Employee(){}

    public int getEmployee_id(){
        return Employee_id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setEmployee_id(int Employee_id){
        this.Employee_id = Employee_id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}