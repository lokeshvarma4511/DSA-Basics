package company.dsa.advancedconcepts.stacksandques;

public class StackMain  {
    public static void main(String[] args) throws StackException {
//        CustomStack s1 = new CustomStack();
        DynamicStack s1= new DynamicStack(5);
        s1.push(34);
        s1.push(67);
        s1.push(3);
        s1.push(7);
        s1.push(78);
        s1.push(5);
        s1.push(57);
        s1.push(51);


        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}