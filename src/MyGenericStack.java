import javax.crypto.ExemptionMechanismException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T elemen){
        stack.addFirst(elemen);
    }
    public T pop() throws ExemptionMechanismException {
        if (isEmpty()){
            throw new ExemptionMechanismException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }return false;
    }

}
