import java.time.LocalDate;

class JavaDates{


    public static String findDay(int month, int day, int year) {
        String answer = "";


        LocalDate withOf = LocalDate.of(2015, 02, 20);
        System.out.println(withOf);
        System.out.println(withOf.getDayOfWeek());

        LocalDate withParse = LocalDate.parse("2015-02-20");
        System.out.println(withParse);
        System.out.println(withParse.getDayOfWeek());


        LocalDate fromFunction = LocalDate.of(year, month, day);
        System.out.println(fromFunction);
        System.out.println(fromFunction.getDayOfWeek());

        //however calendar class version would be:
        // Calendar cal = Calendar.getInstance();
        // cal.set(Calendar.MONTH, month-1);
        // cal.set(Calendar.DAY_OF_MONTH, day);
        // cal.set(Calendar.YEAR, year);
        // return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();



        return answer;

    }

    public static void main(String[] args) {
        findDay(8, 5, 2015);
      }

 
}


