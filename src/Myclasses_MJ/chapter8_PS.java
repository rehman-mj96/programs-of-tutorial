package Myclasses_MJ;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;

    }
}

    class square {
        int side;

        public int area() {
            return side * side;
        }

        public int perimeter() {
            return 4 * side;
        } 
    }

    class Circle {
        float r;
        
        public float Area() {
            return 3.14f * r * r;
        }
    }
public class chapter8_PS {
    public static void main(String[] args) {
        // Problem 1 :
       /*  Employee harry = new Employee();
       harry.salary = 233;
       harry.setName("codeWithHaarry");
       System.out.println("The name of an Employee is " +harry.getName()+" The Salary of that Employee is " + harry.getSalary());
       
       square mySquare = new square();
       mySquare.side = 5;
       System.out.println("The area of the square is " + mySquare.area());
       System.out.println("The Perimeter of the square is " + mySquare.perimeter());
        */
       Circle Cr = new Circle();
       Cr.r = 7;
       System.out.println("The area of the Circle is "+ Cr.Area());       
    }
}
