import java.time.*;
import java.util.Scanner;

public class dateTime {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yyyy = localDate.getYear();
        System.out.println(dd+"-"+mm+"-"+yyyy);

        LocalTime localTime =LocalTime.now();
        System.out.println(localTime);
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        int n = localTime.getNano();
        System.out.println(h+":"+m+":"+s+":"+n);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        int dd1 = localDateTime.getDayOfMonth();
        int mm1 = localDateTime.getMonthValue();
        int yyyy1 = localDateTime.getYear();
        System.out.printf("%d-%d-%d",dd1,mm1,yyyy1);
        int h1 = localDateTime.getHour();
        int m1 = localDateTime.getMinute();
        int s1 = localDateTime.getSecond();
        int n1 = localDateTime.getNano();
        System.out.printf("\n%d:%d:%d:%d",h1,m1,s1,n1);

        LocalDate birthdate = LocalDate.of(1999,Month.SEPTEMBER,06);
        Period period = Period.between(birthdate,localDate);
        System.out.printf("\nYou are %d years, %d months and %d days old",period.getYears(),period.getMonths(),period.getDays());

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Year year = Year.of(num);
        if(year.isLeap())
            System.out.printf("%d is a leap year",num);
        else
            System.out.printf("%d is not a leap year",num);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("\n"+zone);
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
    }
}
