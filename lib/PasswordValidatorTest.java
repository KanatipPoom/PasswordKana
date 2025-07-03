package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        // Test Case 2: รหัสผ่าน8ตัวควรจะ WEAK
        PasswordStrength result2 =PasswordValidator.validate("asdxcvbg");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Short password is WAKE.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }

        // Test Case 3: รหัสผ่านมีตัวอักษตรตัวใหญ่และตัวเล็ก ควรจะ MEDIUM
        PasswordStrength result3 =PasswordValidator.validate("zxcvb123");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: รหัสผ่านมีตัวอักษตรตัวใหญ่และตัวเล็กและอักษรพิเศษ ควรจะ STRONG
         PasswordStrength result4 =PasswordValidator.validate("zxC123*/");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }




        System.out.println("--------------------------------");
    }
}
