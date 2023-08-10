package company.dsa;

import java.util.Locale;

public class PalindromeString
{
    public static void main(String[] args) {
        String s1="ahtr";
//        System.out.println(s1);
        System.out.println(palindrome(s1));
    }
    static boolean palindrome(String str)
    {
        str=str.toLowerCase();
        str=str.strip();

        if(str==null || str.length()==0 )
        {
            return true;
        }
        for(int i=0;i<=str.length()/2;i++)
        {
            int l=str.length()-1;
            if (str.charAt(i)==str.charAt(l-i))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}