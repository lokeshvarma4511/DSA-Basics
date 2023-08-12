package company.dsa.advancedconcepts.stacksandques.queue;

//import company.dsa.advancedconcepts.stacksandques.stack.CustomStack;

public class CustomQueue  {
    public int[] ar1;
    private static final int DEFAULT_SIZE =5;

    public CustomQueue(int size)
    {
        this.ar1 = new int[size];
    }
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    int end=0;
    public boolean insert(int data) throws QueueException
    {
        if (isFull())
        {
            throw new QueueException("Queue is full!");
        }


        ar1[end++]=data;
        return true;
    }

    public int remove() throws QueueException, Exception {
        if (isEmpty())
        {
            throw new QueueException("Queue is empty!");
        }
        int removed=ar1[0];
        for (int i = 0; i < ar1.length-1; i++) {
            ar1[i] = ar1[i + 1];
        }
        end--;
        return removed;
    }
    public int front() throws QueueException{
        if (isEmpty())
        {
            throw new QueueException("Queue is empty!");
        }
        return ar1[0];
    }

    public void display() {
        for (int el:
             ar1) {
            System.out.print(el+" ");
        }
        System.out.println("End");
    }

    public boolean isFull() {
        return end==ar1.length;
    }

    public boolean isEmpty() {
        System.out.println("end in isEmpty()"+end);
        return end==0;
    }

}