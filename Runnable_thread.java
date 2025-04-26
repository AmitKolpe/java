
class t1 implements Runnable{
    public void run(){
        System.out.println("The code is running....");
    }
}

class Runnable_thread{
    public static void main(String[] args) {
        t1 obj = new t1();
        Thread t = new Thread(obj);
        t.start();

         
        
    }
}