import java.util.Stack;

public class SortStackInAscUsingRecursion {
    public static void sortStack(Stack<Integer stack>) {
        if(stack.isEmpty()) return;

        int x = stack.pop();
        sortStack(stack);
        sortInsert(st.x);
    }
    public static void sortInsert(Stack<Integer> stack,x){
        if(st.isEmpty() || st.peek() <=x){
            st.push(x);
            return;
        }
        int top = st.pop();
        sortInsert(stack,x);
        stack.push(x);
    }
     public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        stack.psuh(3);
        stack.psuh(1);
        stack.psuh(4);
        stack.psuh(2);

        sortStack(stack);

        System.out.println(Sorted stack);
        printStack(stack);

    }
}
