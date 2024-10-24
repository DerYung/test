//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int switchValue = 2;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "X";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                return "1st";
            }
            case "APRIL", "MAY", "JUNE" -> {
                return "2nd";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> {
                return "3rd";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                return "4th";
            }
        }

        return "bad";
    }
}