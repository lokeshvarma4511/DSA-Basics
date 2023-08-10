package company.dsa.recurssion;

public class SkipALetterWord {
    public static void main(String[] args) {

//        skip("","baccad");
//        System.out.println(skipWord("abcdappleefg"));

        System.out.println(skipApp("abcdappleefappg"));
    }
    private static void skip(String p,String str)
    {
        if(str.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);
        if(ch=='a')
        {
            skip(p,str.substring(1));
        }
        else
        {
            skip(p + ch, str.substring(1));
        }
    }


    ///skipping a word

//    static String skipWord(String up) {
//
//        if(up.isEmpty())
//        {
//            return "";
//        }
//        if(up.startsWith("apple"))
//        {
//            return skipWord(up.substring(5));
//        }
//        else
//        {
//            return up.charAt(0) + skipWord(up.substring(1));
//        }
//    }

    // skipping only App

    static String skipApp(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("app"))
        {
            if(!up.startsWith("apple"))
            {
                return skipApp(up.substring(3));
            }
            else
            {
                return up.charAt(0) + skipApp(up.substring(1));
            }
        }
        else
        {
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}