package company.dsa;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods
{
    public static void main(String[] args) {
        String s1 = "kalasalingam academy";
        // to apply Arrays.toString() the parameters should be  in array form
        System.out.println(Arrays.toString(s1.toCharArray()));
//        System.out.println(Arrays.toString(s1));
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('s'));
        System.out.println(s1.strip());
        System.out.println(s1);
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(Arrays.toString(s1.split("a")));

    }


}
