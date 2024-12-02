package Polymorphism;

public class PolySample {
    int number;
    String name;


    public PolySample() {
    }


    public PolySample(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String methodOverrideSample(){
        return "Hey From PolySample";
    }

}


