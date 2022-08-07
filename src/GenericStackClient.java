import javax.crypto.ExemptionMechanismException;

public class GenericStackClient {
    public static void main(String[] args) throws ExemptionMechanismException {
        System.out.println("1.Stack of integers");
        stackOfintegers();
        System.out.println("\n2. Stack of String");
        stackOfStrings();
    }
    private static void stackOfStrings() throws ExemptionMechanismException {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("năm");
        stack.push("bốn");
        stack.push("ba");
        stack.push("hai");
        stack.push("một");
        System.out.printf("1.1 size of stack after push operetions: "+ stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.3.size of stack after pop operations :" + stack.size());

    }
    private static  void  stackOfintegers() throws ExemptionMechanismException {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. size of stack after push operations: "+ stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations :" + stack.size());

    }
}
