

interface camera{
    void takephoto();
    void takevideo();
}

class cellphone{
    public void call(){
        System.out.println("calling done!!");
    }
    public void music(){
        System.out.println("play music...");
    }
}
 class myphone extends cellphone implements camera{
    public void takephoto(){
        System.out.println("take  photo");
    }
    public void takevideo(){
        System.out.println("take video");
    }
 }




class Default_method{
    public static void main(String[] args) {
         myphone m = new myphone();
         m.takephoto();
         m.takevideo();
         m.call();

    }
}