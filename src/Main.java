import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static  Scanner scanner = new Scanner(System.in);
    static  String staticPattern = "^\\+380\\d{9}$";
    static int count;
    static int countNumbersArry() {
        System.out.print("Enter count of numbers that you want to check: ");
        count = scanner.nextInt();
        scanner.skip("\\R");
        return count ;
    }
    public static void main(String[] args) {
        String[] MobileNums = new String[countNumbersArry()];
        for (int i = 0; i < MobileNums.length; i++) {
            System.out.printf("Enter number " + (i + 1) + ": " );
            MobileNums[i] = scanner.nextLine();
        }
        for (String numbers : MobileNums) {
            boolean valid = validateMobileNumber(numbers);
            System.out.println(numbers + " - " + (valid ? " number which added to array MobileNums are valid" : " " +
                    "Current numbers is invaild,please try again"));
        }
    }
    private static boolean validateMobileNumber(String number) {
        Pattern compiledPatter = Pattern.compile(staticPattern);
        Matcher matcher = compiledPatter.matcher(number);
        return  matcher.matches();
    }
}




