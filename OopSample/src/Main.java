import Abstract.AbstractSampleImpl;
import Encapsulation.EncapSample;
import Polymorphism.PolySample;
import Polymorphism.SubClass;

public class Main {
    public static void main(String[] args) {

        StaticSample s=new StaticSample();

        int num=100;
        String str=String.valueOf(num);
        System.out.println("String from number " +str);

        StringBuilder sb=new StringBuilder();
        StringBuffer ex=new StringBuffer("Hello");


        sb.append('d');

        sb.append("Hello");

        System.out.println("StringBuilder sample " +sb);

        System.out.println("StringBuffer sample " +ex);


    }
}

class StaticSample extends Main{
    static int num;
    static {
        num = 18;
        System.out.println("Static got executed and num value is "+ num);
    }


}