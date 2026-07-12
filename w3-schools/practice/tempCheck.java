public class tempCheck {
    public static void main(String[] args) {
        int hotDays = 7;
        int totalDays = 9;
        double fractionOfDays = ((double) hotDays / (double) totalDays);
        System.out.println("The fraction when it comes to hot days versus total days is: " + fractionOfDays);

        final double reading = 98.6;
        int readingInt = (int) reading;

        // Rounding will round to next number so in this case I believe it's 99

        System.out.println(Math.round(reading));

        // This is just going to print 98 because 98 is the cutoff if that makes sense
        System.out.println(readingInt);

        boolean isFever = reading > 100.4;

        System.out.println(isFever);

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("This is the default case. You get the idea.");
        }

        System.out.println(Math.max(hotDays, totalDays));
        System.out.println(Math.sqrt(totalDays));
        System.out.println(Math.abs(hotDays - totalDays));
    }
}
