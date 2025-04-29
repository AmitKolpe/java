

class Time{
    public static void main(String[] args) {
        
        System.out.println("The milli sec from 1970:-"+System.currentTimeMillis());
        System.out.println("The second are:-"+System.currentTimeMillis()/1000);
        System.out.println("The Minute:-"+System.currentTimeMillis()/1000/3600);
        System.out.println("The Hour:-"+System.currentTimeMillis()/1000/3600/24);
        System.out.println("The year:-"+System.currentTimeMillis()/1000/3600/24/365);
    }
}