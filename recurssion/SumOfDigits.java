package company.dsa.recurssion;

public class SumOfDigits {

    public static void main(String[] args) {
        int num=23;
//        System.out.println(sumOfDigits(num));
        System.out.println(prodOfDigits(num));
    }
//     static int sumOfDigits(int num)
//    {
//        if(num==0)
//        {
//            return  0;
//        }
//
//        return num%10 * sumOfDigits(num/10);
//    }
    static int prodOfDigits(int num)
    {
        if(num%10 ==num)
        {
            return  num;
        }
        return (num%10) * prodOfDigits(num/10);
    }
}