public class GradeBook {
    public static void main(String[] args) {
        int[] TestScores = {85, 92, 78, 95, 88, 70};
        float sum = 0;
        for (int score : TestScores) {
            sum += score;
        }
        float myAverage = (sum / TestScores.length);
        System.out.println("The average is " + myAverage);
    }
}