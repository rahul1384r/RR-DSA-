public class TypesOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("RRY");
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;
    // non parameterized
    Student(){
        System.out.println("Constructor is called");
    }
    // parameterized 
    Student(String name){
        this.name=name;
    }
    // copy
}

/*when we use multiple constructors in a single class with different 
  parameters then this is called constructor overloading*/
