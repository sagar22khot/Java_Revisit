
import java.util.*;

public class DataType {
    public static void main(String[] args) {

        // Data type max and min values
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Short.MAX_VALUE);
        System.out.println("Byte Min: " + Short.MIN_VALUE);
        System.out.println("Byte Max: " + (Character.MAX_VALUE + 0));
        System.out.println("Byte Min: " + (Character.MIN_VALUE + 0));
        System.out.println("Byte Max: " + Integer.MAX_VALUE);
        System.out.println("Byte Min: " + Integer.MIN_VALUE);
        System.out.println("Byte Max: " + Float.MAX_VALUE);
        System.out.println("Byte Min: " + Float.MIN_VALUE);
        System.out.println("Byte Max: " + Double.MAX_VALUE);
        System.out.println("Byte Min: " + Double.MIN_VALUE);
        System.out.println("Byte Max: " + Long.MAX_VALUE);
        System.out.println("Byte Min: " + Long.MIN_VALUE);

        // More data types
        boolean happy = true;
        char a = 'a';
        // float fNum1 = 1.111111111; Here, RHS is considered as double
        // Add F to make it float
        float fNum1 = 1.1111111111111F;
        float fNum2 = 1.1111111111111F;
        double fNum3 = 1.1111111111111;
        double fNum4 = 1.1111111111111;
        double fNum5 = 1.1111111111111F;
        double fNum6 = 1.1111111111111F;

        System.out.println("Float sum: " + (fNum1 + fNum2));
        System.out.println("Double sum: " + (fNum3 + fNum4));
        System.out.println("Float sum as double: " + (fNum5 + fNum6));

        // Datatype Casting
        // Casting small datatype to large doesnt give error
        int var1 = 10;
        long var2 = var1;

        // Casting large datatype to small will give error.
        // Hence, type cast is used
        double var3= 1.234;
        int var4 = (int)var3;
        long var5 = 12212423346L;
        long var6 = 122124234;
        System.out.println("Test Long 1: " + var5);
        System.out.println("Test Long 2: " + var6);
        int var7 = (int)var5;
        int var8 = (int)var6;
        // Big Integer has even more capacity

        // converting to Strings
        // Long might have issues being converted to String
        String convertString = Integer.toString(var7);
        String stringInt = Integer.toString(var8);
        System.out.println("Test Strings " + var3 + " " + stringInt);



    }
}
