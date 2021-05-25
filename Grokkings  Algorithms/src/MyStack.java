public class MyStack<T> {
    class Top<T>{
        T val = null;
        Top under = null;

        Top(T val, Top under){
            this.val = val;
            this.under = under;
        }
    }

    Top top;

    MyStack(){
        this.top = new Top(null, null);
    }

    public void push(T number){
        Top node = new Top(number, this.top);
        this.top = node;
    }
    public Top pop(){
        if(this.top.val == null)
            throw new NullPointerException();
        else{
            Top result = this.top;
            this.top = this.top.under;
            return result;
        }
    }

    public boolean isEmpty(){
        if(this.top.val == null)
            return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        Top element = this.top;
        while(element.val != null) {
            elements.append( element.val + ", " );
            element = element.under;
        }
        return elements.toString();
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        for (Double i = 0.0; i < 10; i++) {
            stack.push(String.valueOf(i) + " ?");
        }

        while (!stack.isEmpty()){
            stack.pop();
            System.out.println(stack);
        }
    }
}
