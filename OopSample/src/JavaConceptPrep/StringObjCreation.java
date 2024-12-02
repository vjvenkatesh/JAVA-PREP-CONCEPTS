package JavaConceptPrep;

public class StringObjCreation {

    /*
        4 ways we can creating String in Java.
        1)String Literal
        2)Using new keyword
        3)StringBuffer and StringBuilder





        1)String literal:
           String sample="Hello";
           String sample2="Hello";  // this will reuse the memory of sample variable
               It will check String constant pool to see if identifical string already exists if it's
               there means java will reuses the existing object otherwise created new.

               if we are checking equal in java this will return true ;
               if(sample == sample2);   // true  bcz both uses the same string object in memory.



        2)Using new keyword:
            String sample=new String("Hello");
            String sample2=new String("Hello");   // even though both has the same value this new will
            create explicit space in the heap memory .

            if we are checking equal in java this will return false ;
            if(sample == sample2);   // false


       3)StringBuffer & StringBuilder
            need of this is mutablity to StringObject . while create using String that is immutable
            whenever changing the content of string that will create new space in the memory

            In stringbuffer and stringbuilder content can be changes without creating new object .

            both are inbuild classes:
                like how we creating a object like other classes we can using the same for both.
                example:
                    StringBuilder example=new StringBuilder();
                    StringBuilder example2=new StringBuilder("Hello");

                    StringBuffer sexample=new StringBuffer();
                    StringBuffer sexample=new StringBuffer("Hey");



     */
}
