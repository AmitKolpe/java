public class Month{
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + ": " + months[i]);
        }
    }
}
