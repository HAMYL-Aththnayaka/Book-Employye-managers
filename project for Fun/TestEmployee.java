class TestEmployee{
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.setEmployee_id(1221);
        emp1.setName("Mr.Rowdy");
        emp1.setAge(33);

        System.out.println("Employee Id: " +emp1.getEmployee_id());
        System.out.println("Employee name: " +emp1.getName());
        System.out.println("Employee age: " +emp1.getAge());
    }
}