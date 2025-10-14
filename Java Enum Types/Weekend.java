public class Weekend {
  public enum Day {
    SATURDAY,
    SUNDAY
  }

  public static void main(String[] args) {
    Day day1 = Day.SATURDAY;
    Day day2 = Day.SUNDAY;

    System.out.println("First day of the weekend: " + day1);
    System.out.println("Second day of the weekend: " + day2);
  }
}
