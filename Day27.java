import java.util.ArrayList;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id , String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        ArrayList<Employee> a=new ArrayList<>();
        a.add(new Employee(101,"Rahul" , 45000));
        a.add(new Employee(102, "Aman", 55000));
        a.add(new Employee(103, "Naman",65000));


        for(Employee s : a){
            if(s.salary < 50000)
                s.salary += 5000;

            s.display();
        }

        for(int i=0;i< a.size();i++)
        {
            a.get(i).display();
        }
    }
}
