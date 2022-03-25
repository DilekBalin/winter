package english;

public class day03typecastingwrapperscanner {
//Type Casting: Converting small data type to large data type
// or converting large data type to small data type
//byte< short< int< long< float <double



    public static void main(String[] args) {

      //How to convert small data type to large data type:Aoto Widening
        byte b=47; //47 is in byte data type
        int i=b; // 47 is in int data type
        //  because Java does it automaticlly
        System.out.println(b);


        //How to convert large data type to small data type : Explicit Narrowing
        double d=1.2;
        short s= (short)d;
        System.out.println(d);//1.2


        //convert short 257 to byte?

         short r=257;
         byte y= (byte)r;
        System.out.println(y);//1

    }
}

