package company.dsa.advancedconcepts.stacksandques.stack;

public class CustomStack {
    private static final int DEFAULT_SIZE = 5;
    protected int[] ar1;
    int ptr=-1;

    public CustomStack(int size)
    {
        this.ar1= new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }



    public boolean push(int data)
    {
        if (isFull())
        {
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        ar1[ptr]=data;
        return true;

    }

    public int pop() throws StackException
    {
        if (isEmpty())
        {
            throw new StackException("Stack is empty!. Cannot pop");
        }

        return ar1[ptr--];
    }
    public int peek() throws StackException
    {
        if (isEmpty())
        {
            throw new StackException("Stack is empty!. Cannot peek");
        }

        return ar1[ptr];
    }


    public boolean isEmpty() {
        return ptr==-1;
    }

    public boolean isFull() {
        return ptr==ar1.length-1;
    }

}