package company.dsa.advancedconcepts.stacksandques.queue;

public class CircularQueue {
    int[] ar1;
    int size=0;
    static final int DEFAULT_SIZE=5;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size)
    {
        ar1 =new int[ size];

    }

    int start=0;
    int end=0;
//    int size=0;

    public boolean insert(int data) throws QueueException {
        if (isFull())
        {
            throw new QueueException("Queue is Full");
        }
//        super.insert(data);
        ar1[end++]=data;
        end%=ar1.length;
        size++;
//        System.out.println("End from insert "+end);
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty())
        {
            throw new QueueException("Queue is empty!");
        }
        int remove= ar1[start++];
        start%=ar1.length;
        size--;
        return remove;
    }


    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty!");
            return;
        }
        for (int i = 0; i <end-start ; i++) {
            System.out.print(ar1[i]+" ");
        }
        System.out.println("END");
    }


    private boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==ar1.length;
    }

    public static void main(String[] args) throws QueueException {
        CircularQueue c1= new CircularQueue(5);
        c1.insert(34);
        c1.insert(67);
        c1.insert(3);
        c1.insert(7);
        c1.insert(78);
//        c1.insert(4);
//        System.out.println("end "+c1.end);
//        c1.insert(5);
//        q1.insert(57);
//        q1.insert(51);


        System.out.println(c1.remove());
        System.out.println(c1.remove());
        System.out.println(c1.remove());
        System.out.println(c1.remove());
        System.out.println(c1.remove());
        System.out.println(c1.remove());

//        System.out.println(q1.remove());dd
//        System.out.println(q1.remove());
//        System.out.println(q1.remove());
    }
}