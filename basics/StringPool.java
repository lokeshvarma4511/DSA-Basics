package company.dsa;
public class StringPool
{
    public static void main(String[] args)
    {
        //same value one object
        String name="kunal";
        String b="kunal";
        System.out.println(name==b);
        //creating different objects
        String s1 = new String("happy");
        String s2 = new String("happy");
        System.out.println(s1==s2);
        //checks only the value
        System.out.println(s1.equals(s2));
        //Strings are character arrays
//        System.out.println(s2[0]);  gives error
        System.out.println(s1.charAt(0));
    }
}