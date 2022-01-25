public class TestStack {
    public static void main(String[] args) { 
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 10-1; i>=0; i--){
            stack.push(i);

            while(!stack.empty())
                System.out.print(stack.pop() + " ");
        }
    }
}
