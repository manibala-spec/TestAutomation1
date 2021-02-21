package oops;

public class ExecuteMathsBasic {

    public static void main(String[] args) {
       /* MathsBasic obj1 = new MathsBasic();
        int output = obj1.sum(3,5);
        System.out.println(output);

        MathsBasic obj2 = new MathsBasic();
        output = obj2.sum(2,3);
        System.out.println(output);

        System.out.println( obj2.multiplication(5, 6) );*/

       InterfaceEx obj1 = new ChildOneForInterfaceEx();
        System.out.println(  obj1.sum(2,3)  );

        InterfaceEx obj2 = new ChildTwoForInterfaceEx();
        System.out.println(  obj2.sum(2,3)  );

    }

}
