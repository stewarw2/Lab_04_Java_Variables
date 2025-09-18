public class Lab_04_Java_Variables {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 4;
        double intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference =  intOperandA - intOperandB;
        int intQuotient =  intOperandA / intOperandB;
        int intModulo;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        double doubleOperandA = 2.5;
        double doubleOperandB = 6.9;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference =  doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int kidAmount = 2;
        boolean isRaining = false;
        double gasPrice = 3.20;
        int favNumber = 7;
        int shoeSize = 12;
        int birthMonth = 8;
        String fullName = "Will Stewart";
    }
}