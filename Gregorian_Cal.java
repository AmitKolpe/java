import java.util.Calendar;

class Gregorian_Cal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE));
    }
}
