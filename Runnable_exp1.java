
class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("I am thread 1 not a threat 1");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat 2");
    }
}




class Runnable_exp1{
    public static void main(String[] args){

        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bulllet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bulllet2);

        gun1.start();
        gun2.start();



    }
}