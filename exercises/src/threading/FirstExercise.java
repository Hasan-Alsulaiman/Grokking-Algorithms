package threading;

public class FirstExercise {
    public static class Thread1 implements Runnable{
        private int start;
        private int finish;
        Thread1(int num, int finish){
            this.finish = finish;
            this.start = num;
        }
        @Override
        public void run(){
            addNumbers(start, finish);
        }
    }
    private static int addNumbers(int start, int finish){
        int result = 0;
        for (int i = start; i < finish; i++) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 1000000000;
        long start = System.currentTimeMillis();
        int result1 = addNumbers(0, number);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);


        Thread thread1 = new Thread(new Thread1(0 ,number/2));
        Thread thread2 = new Thread(new Thread1(number/2, number));
        start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);

    }
}
