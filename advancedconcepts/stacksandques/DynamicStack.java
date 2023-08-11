package company.dsa.advancedconcepts.stacksandques;

public class DynamicStack extends CustomStack{
    public DynamicStack(int size)
    {
        super();
    }
    public DynamicStack()
    {
        super();
    }

    @Override
    public boolean push(int data) {
        if (super.isFull() )
        {
            int[] temp= new int[ar1.length*2];
            //copying
            for (int i = 0; i < ar1.length ; i++) {
                temp[i]= ar1[i];
            }
            ar1=temp;
        }
        return super.push(data);
    }
}