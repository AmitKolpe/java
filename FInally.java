


class Finally{
    public static void main(String[] args) {
        
        int a = 20;
        int b = 10;

        while (true) { 
            try {
                System.out.println(a/b);
            
            } catch (Throwable e) {

               System.out.println(e);
               break;
            }
            finally{
                System.out.println("The value of b:"+b);
                
            }
            b--;
        }
    }
}