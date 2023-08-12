package company.dsa.advancedconcepts.stacksandques.queue;

public class QueueMain {
    public static void main(String[] args) throws QueueException, Exception {
        CustomQueue q1 = new CustomQueue();
        q1.insert(34);
        q1.insert(67);
        q1.insert(3);
        q1.insert(7);
        q1.insert(78);
        System.out.println("end "+q1.end);
//        q1.insert(5);
//        q1.insert(57);
//        q1.insert(51);


        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
//        System.out.println(q1.remove());dd
//        System.out.println(q1.remove());
//        System.out.println(q1.remove());
    }
}
