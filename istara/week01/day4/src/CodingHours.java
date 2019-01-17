public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int codeHours = 6;
        int semester = 17;
        int myNumber = codeHours * 5 * semester;
        System.out.println(myNumber);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float semesterWork = 52 * 17;
        float totalHours = 168 * 17;
        float myNumberPerc = semesterWork / (totalHours / 100.0f);
        System.out.println(myNumberPerc + "%");
    }
}