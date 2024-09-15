package main.java;

public class PermisConducere {

    public static void main(String[] args) {
//        String result = drivingLicence(24, 30);
//        System.out.println(result);
        System.out.println(drivingLicence(24, 30));

        System.out.println(resultForExam('B'));
    }

    public static String drivingLicence(int punctaj, int varsta) {
        if (punctaj >= 22 && varsta >= 18) {
            // true
            return "Felicitari!";
            // false
        }
        return "Imi pare rau!";
    }

    // A, B, C, D, F - char
    // A - Excellent
    // B, C = Well Done!
    // D - You passed!
    // F -  Go home!
    // X, Y, AB - Invalid grade!

    public static String resultForExam(char grade) {
        if (grade == 'A') {
            return "Excellent";
        } else if (grade == 'B' || grade == 'C') {
            return "Well done!";
        } else if (grade == 'D') {
            return "You passed!";
        } else if (grade == 'F') {
            return "Go home!";
        }return "Invalid grade!";
    }
}
