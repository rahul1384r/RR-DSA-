public class Classes_objects{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        p1.setTip(2);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.color="BLUE";
        p1.tip=3;
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    // function for changing color
    void setColor(String newColor){
        color=newColor;
    }
    // function for changing tip
    void setTip(int newTip){
        tip=newTip;
    }
}