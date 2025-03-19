public class Grade {
    public static void main(String[] args) {
        double examScore = 85.0; // Example score
        double assignmentScore = 88.0; // Example score
        double projectScore = 92.0; // Example score

        // Simple averaging (you can use more complex weighting schemes)
        double averageScore = (examScore + assignmentScore + projectScore) / 3;

        String finalGrade;
        if (averageScore >= 90) {
            finalGrade = "A";
        } else if (averageScore >= 80) {
            finalGrade = "B";
        } else if (averageScore >= 70) {
            finalGrade = "C";
        } else if (averageScore >= 60) {
            finalGrade = "D";
        } else {
            finalGrade = "F";
        }

        System.out.println("You passed the exam!");
        System.out.println("Keep improving!");
        System.out.println("Grade: " + finalGrade);
        System.out.println("Multi-way Grade: " + finalGrade); //In this example, it's the same
    }
}
