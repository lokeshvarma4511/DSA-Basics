package company.dsa.JavaBasics;

public class Power {
    public static void main(String[] args) {

        int base = 3;
        int power = 3;
        int ans=1;

        while(power>0)
        {
            if((base & 1) == 1)
            {
                ans*=base;
            }
            power>>= 1;
            base*=base;
        }
        System.out.println(ans);
    }
}