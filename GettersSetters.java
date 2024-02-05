public class GettersSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        System.out.println(p1.getColor());  //accessing thorugh getter
        p1.setTip(2);
        System.out.println(p1.getTip());    //accessing thorugh getter 
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    void setTip(int tip){
        this.tip=tip;
    }

    public int getTip(){
        return this.tip;
    }
}
