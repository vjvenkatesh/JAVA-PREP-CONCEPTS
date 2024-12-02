package Polymorphism;

public class SubClass extends PolySample{



    public SubClass(){
        name = "Subclass";
        number= 20;
        System.out.println(
                name
                        +
                        " "+ number
        );
    }

    public String methodOverrideSample(){
        return "Hey From SubClass";
    }

}
