public class MyQueue {
    private char q[];
    private int putLoc, getLoc;

    public MyQueue(int size) {
        this.q = new char[size];
        this.putLoc = this.getLoc = 0;
    }

    void put(char value) {
        if(putLoc == q.length-1){
            System.out.println("increasing size ...");
            q = copyToBigger();
        }

        q[++putLoc] = value;
    }

    char get(){
        if(getLoc == putLoc) {
            System.out.println("error! q is empty");
            return (char) 0;
        }
        else
            return q[++getLoc];
    }

    int size(){
        return putLoc;
    }

    private char[] copyToBigger(){
        int newSize = q.length * 2;
        char[] biggerQ = new char[newSize];
        for(int i=0; i<q.length; i++){
            biggerQ[i] = q[i];
        }
        return biggerQ;
    }
}
