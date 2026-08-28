package week2.assigment_problems;

public class PinValidator {

    public static void checkPinLength(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
            return;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                System.out.println("Invalid PIN — must be exactly 4 digits.");
                return;
            }
        }

        System.out.println("PIN length OK");
    }

    public static void main(String[] args) {

        checkPinLength("4820");
    }
}