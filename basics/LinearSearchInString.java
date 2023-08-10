package company.dsa.basics;

public class LinearSearchInString
{
    public static void main(String[] args) {
        String str = "kalasalingam";
        char tg='a';
        int index = search1(str, tg)+1;
        System.out.println("char present at "+index);
    }

    static int search1(String str, char tg)
    {
        if(str.length()<0) {
            return -1;
        }

//        for(char a:str.toCharArray())
//        {
//            if(a==tg)
//            {
//                return a;
//            }
//        }


        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==tg)
            {
                return i;
            }
        }
        return -1;
    }
}
