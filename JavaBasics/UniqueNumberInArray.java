package company.dsa.JavaBasics;

public class UniqueNumberInArray
{
    public static void main(String[] args) {
        int[] arr = {2,4,2,4,5,6,5};
        System.out.println(uniqueEl(arr));

    }

    private static int uniqueEl(int[] arr)
    {
        int unique = 0;

        for(int i:arr)
        {
            unique^=i;
        }
        return unique;
    }
}
