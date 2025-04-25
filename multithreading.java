
class multi extends Thread{
    public void run(){
        int i=0;
        while(i<100000){
            System.out.println("the code is running ...");
            System.out.println("the error in code..");
            i++;
        }
    }

}
class multi_1 extends Thread{
    public void print(){
        int j=0;
        while(j<100000){
            System.out.println("please change code...");
            j++;
        } 

    }
}



class multithreading{


    public static void main(String[] args) {

        multi m = new multi();
        m.run();
        multi_1 m1 = new multi_1();
        m1.print();
        
    }
}