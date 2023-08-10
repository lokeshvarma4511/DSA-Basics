package company.dsa.JavaBasics;
public class PowerOf2OrNot {
    public static void main(String[] args) {
        int n = 13;

        int k = (int) ((Math.log(n)) / (Math.log(2)));
        int count = 0;
        for (int i = 0; i <=k; i++) {
//            System.out.println(i);
            int c = n & (1);
            if (c ==1) {
                count++;
            }
            n=n>>1;
        }
            if(count==1)
            {
                System.out.println("true");

            }
            else
            {
                System.out.println("false");
            }

//        int bol=n&(n-1);
//        if(bol==0)
//        {
//            System.out.println("true");;
//        }
//        else
//        {
//            System.out.println("false");;
//        }
//    }
    }
}