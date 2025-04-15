package Myclasses_MJ;

class MyEmployee {
    private int id;
    private String name;

    public MyEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //public void setName(String n) { this.name = n; }

    //public void setId(int i) { this.id = i; }


}

public class constructor {
    public static void main(String[] args) {
        MyEmployee employee = new MyEmployee("Mujahid Ur Rehman", 45);
        System.out.println(employee.getName());
        System.out.println(employee.getId());
    }
}
    