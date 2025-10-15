import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateUtils {
    static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

class TestDateFormat {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Default: " + now);
        System.out.println("Formatted: " + DateUtils.formatDate(now, "dd-MM-yyyy"));
        System.out.println("Formatted: " + DateUtils.formatDate(now, "yyyy/MM/dd HH:mm:ss"));
    }
}
