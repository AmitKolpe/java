
import java.util.HashSet;

class set{

    public static void main(String[] args) {
        
        HashSet<Integer>myHashset = new HashSet<>();

        myHashset.add(7);
        myHashset.add(45);
        myHashset.add(1);
        myHashset.add(18);
        System.out.println(myHashset);
        myHashset.clear();
        myHashset.add(33);
        System.out.println(myHashset);
        myHashset.contains(0);
        System.out.println(myHashset.isEmpty());
        System.out.println(myHashset.size());
        System.out.println(myHashset.equals(33));

    }
}