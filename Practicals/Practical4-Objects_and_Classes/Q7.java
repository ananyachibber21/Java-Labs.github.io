import java.util.Scanner;

class HeartRates {

    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    // constructor
    public HeartRates( String fName, String lName, int aMonth,
        int aDay, int aYear) {

        firstName = fName;
        lastName = lName;
        month = aMonth;
        day = aDay;
        year = aYear;
    }

    // method to set first name
    public void setFirstName( String fName ) {
        firstName = fName;
    }

    // method to get first name
    public String getFirstName() {
        return firstName;
    } 

    // method to set last name
    public void setLastName( String lName ) {
        lastName = lName;
    }

    // method to get last name
    public String getLastName() {
        return lastName;
    }

    // method to set month
    public void setMonth( int aMonth ) {
        month = aMonth;
    }

    // method to get month
    public int getMonth() {
        return month;
    }

    // method to set day
    public void setDay( int aDay ) {
        day = aDay;
    }

    // method to get day
    public int getDay() {
        return day;
    }

    // method to set year
    public void setYear( int aYear ) {
        year = aYear;
    }

    // method to get year
    public int getYear() {
        return year;
    }

    // returns person's age
    public int ageInYears() {
        return 2021 - getYear();
    }

    // returns maximum heart rate
    public int maxHeartRate() {
        return 220 - ageInYears();
    } 

    // display target heart rate
    public String targetHeartRate() {
    // targetHeartRate = range 50% - 85% of maxheartrate
        double fifty = 0.5 * maxHeartRate();
        double eightyFive = 0.85 * maxHeartRate();
        String target = (int)fifty + " BPM - " + (int)eightyFive + " BPM\n"; 
        return target;
    }

} // end class HeartRates

public class Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;
        int month;
        int day;
        int year;

        // collecting user's information
        System.out.print("Enter your first name: ");
        firstName = sc.nextLine(); // no need of setFirstName()

        System.out.print("Enter your last name: ");
        lastName = sc.nextLine(); // no need of setLastName()

        System.out.print("Enter your date of birth(month day year): ");
        month = sc.nextInt(); // no need of setMonth()
        day = sc.nextInt();   // no need of setDay()
        year = sc.nextInt();  // no need of setYear()

        /* Object of HeartRates is defined after reading all values */
        HeartRates hr = new HeartRates(firstName, lastName, month, day, year); // calling constructor with arguments

        // displaying user's information
        System.out.printf("\nFirst Name: %s\n", hr.getFirstName());
        System.out.printf("Last Name: %s\n", hr.getLastName());
        System.out.printf("Date of birth: %d\\%d\\%d\n", hr.getMonth(), hr.getDay(), hr.getYear());
        System.out.printf("Age: %d\n", hr.ageInYears());
        System.out.printf("Maximum heart rate: %d BPM\n", hr.maxHeartRate());
        System.out.printf("Target heart rate: " + hr.targetHeartRate());

    } // end method main
} // end class HeartRateTest
