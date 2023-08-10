package company.dsa;

public class SB
{
    public static void main(String[] args) {

        /*
        every time for loop runs, s1 value is newly created
        makes T(n2)
         */
//        String s1 = "start ";
//        for(int i=0;i<26;i++)
//        {
//            char ch = (char) ('a' + i);
//            s1+=ch;
//        }
//        s1+=" end";
//        System.out.println(s1);
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch = (char) ('a' + i);
            s1.append(ch);
        }
        System.out.println(s1.toString());
        System.out.println(s1);
        //deleting character
        s1.deleteCharAt(3);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
    }
}
