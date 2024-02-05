// // An example of copy constructor
// public class CopyConstructor {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name="RRY";
//         s1.roll=220;
//         Student s2 = new Student(s1);
//         System.out.println(s2.name+" "+s2.roll);
//     }
// }

// class Student{
//     String name;
//     int roll;

//     Student(Student s1){
//         this.name=s1.name;
//         this.roll=s1.roll;
//     }
//     Student(){
//     }
// }



// In copy constructor if there is an object which is copied in other constructor
// cannot be copied instead of it will get referenced.
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="RRY";
        s1.roll=220;
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=100;
        Student s2 = new Student(s1);
        s1.marks[1]=200;    //if we update the s1 marks after copying then the changes will also reflect in s2.
        System.out.println(s2.name+" "+s2.roll);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        this.marks=s1.marks;
    }
    Student(){
        marks=new int[3];
    }
}