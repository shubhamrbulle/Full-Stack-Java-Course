package DSA_Java;

class TaskEvenOdd implements Runnable{
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber){
        this.print = print;
        this.max = max;
        this.isEvenNumber=isEvenNumber;
    }
    @Override
    public void run(){
        int number = isEvenNumber == true?2:1;
        while(number<=max){
            if(isEvenNumber){
                //System.out.println("Thread Even:"+Thread.currentThread().getName());

                print.printEven(number);
            }
            else{
                //System.out.println("Thread odd"+Thread.currentThread().getName());

                print.printEven(number);
            }
            number+=2;

        }
    }
}

class Printer{
    boolean isOdd = false;
    synchronized void printEven(int number){
        while(isOdd == false){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread Even: "+number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number){
        while(isOdd == true){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread Odd: "+number);
        isOdd = true;
        notifyAll();
    }
}

public class Test {
    private static final int MAX = 0;
    
        public static void main(String... args){
            Printer print = new Printer();
            Thread t1 = new Thread(new TaskEvenOdd(print, MAX, false));
            Thread t2 = new Thread(new TaskEvenOdd(print, MAX, true));
        t1.start();
        t2.start();
    }
    
}
