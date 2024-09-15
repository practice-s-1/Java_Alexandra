package main.java;

public class Calculator {

    public int sum;
    private String result;
    protected String averageResult;

    public static void main(String[] args) {
        int a = 15;
        int b = 30;

        int c = 45;
        int d = 50;

        System.out.println("The sum is: " + (a + b));
        System.out.println("The sum with the new method: " + sum(85, 100));
        System.out.println(typeOfNumber(2));

        System.out.println("The message for the method is: " + eligibilPentruCredit(3500, 5));
        System.out.println("Concatenarea: " + c);
    }

    public static int sum(int nr1, int nr2) {
        // method body
//        int sum = 0;
//        sum = nr1 + nr2;
//        return sum;
        return nr1 + nr2;
    }

    String name1 = "Iasi";
    String name2 = "Iasi";
    // name1.equals(name2) // non-primitive

    public static boolean typeOfNumber(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            // true
            System.out.println("Numarul " + number + " este par!");
            return result;
            // false
        } else {
            System.out.println("Numarul " + number + " este impar!");
            return result;
        }
    }

    // castiga mai mult de 3000 lei , vechimea mai mare de 2 ani

    public static String eligibilPentruCredit(int salariu, int vechime) {
        if(salariu > 3000 && vechime > 2) {
            return "Felicitari! Esti eligibil pentru credit!";
        }else{
            return "Nu esti eligibil!";
        }
    }



}
