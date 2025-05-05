

import java.util.ArrayList;

class Array_list{
    public static void main(String[] args){

        ArrayList<Integer> l1 = new  ArrayList<>();
        ArrayList<Integer> l2 = new  ArrayList<>();

        l2.add(50);
        l2.add(51);
        l2.add(53);

                l1.add(20);
                l1.add(7);
        l1.add(30);
        l1.add(40);
        l1.add(7);
        l1.addAll(l2);
  
        System.out.println(l1.contains(7));
        System.out.println(l1.contains(33));

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println("The index is:"+l1.indexOf(7));
        System.out.println("last index"+l1.lastIndexOf(7));
    }
}