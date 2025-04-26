
class priority extends Thread{
    public void run(){
        System.out.println("The name "+currentThread().getName());
        System.out.println("Your priority "+currentThread().getPriority());
    }
}


class priority_thread{
    public static void main(String[] args) {
        priority t1 = new priority();
        priority t2 = new priority();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        
    }
}