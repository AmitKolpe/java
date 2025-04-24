class Constructor_1 {

    public Constructor_1() {
        System.out.println("Default constructor");
    }

    public Constructor_1(int I, String N) {
        System.out.println("The first Id is: " + I);
        System.out.println("The First Name is: " + N);
    }

    public Constructor_1(int i, String n, int s) {
        System.out.println("The second id is: " + i);
        System.out.println("The second name is: " + n);
        System.out.println("The Second salary is: " + s);
    }

    public static void main(String[] args) {
        Constructor_1 c = new Constructor_1(51, "finch");
        Constructor_1 c1 = new Constructor_1(55, "Brook", 546);
    }
}
