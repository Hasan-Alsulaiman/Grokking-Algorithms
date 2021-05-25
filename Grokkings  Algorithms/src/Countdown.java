public class Countdown {
    private static int countFrom(int start){
        if(start == 0)
            return 0;
        else
            System.out.println(start);
            return countFrom(start - 1);
    }

    public static void main(String[] args) {
        countFrom(9);
    }
}
