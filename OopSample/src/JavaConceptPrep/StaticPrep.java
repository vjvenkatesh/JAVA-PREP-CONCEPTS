package JavaConceptPrep;

public class StaticPrep {

    /*

    Static Variable:
             1) A static variable is shared among all instances of a class.
             2) Memory for static variables is allocated once when the class is loaded.

        static int number = 12;

        one example:
        //Have created a constructor on this class
        public StaticPrep(){
            number++;
        }


        whenever we're initializing object by like this
        StaticPrep staticPrep=new StaticPrep();
        // By default it is also calling that default constructor as well so
        when we are creating multiple object on this class
        the value of number will be increased on each initialization.

-------------------------------------------------------------------------------------------------------

        Static Blocks:
        DEFINITION ---  Used to initialize static variables.
                        Executed once when the class is loaded.
           class StaticBlock{
           static int blockExample;
           static{
                blockExample=20;
                System.out.println("This Static block is executed")
           }
           }


------------------------------------------------------------------------------------------------------
        Static Methods:
               1) Can be called without creating an instance of the class.
               2) Cannot access instance variables or methods directly.


    class SampleStaticMethod{
         static int square(int number) {
              return number * number;
            }
        }
--------------------------------------------------------------------------------------------------------
     */
}
