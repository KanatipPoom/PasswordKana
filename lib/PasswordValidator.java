package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (password.length()<8) {
            return PasswordStrength.INVALID;
        }
       
        boolean Lower =false;
        boolean Upper =false;
        boolean Special =false;
        boolean Digit =false;
        for(char c:password.toCharArray()){
            if (Character.isLowerCase(c)) {
                Lower=true; }
                else {if (Character.isUpperCase(c)) {
                   Upper=true; 
                }
            else {if (Character.isDigit(c)) {
                Digit=true;}
                else Special =true;}
            }    
        }

       int pw=0;
       if (password.length()>=minLength) {pw++; }
       if (Digit) {pw++;}
       if (Upper) {pw++;}
       if (Lower) {pw++;}
       if (Special) {pw++;}


       if (pw>=4) {
        return PasswordStrength.STRONG;}
        else {if (pw>=3) {return PasswordStrength.MEDIUM;}
         else {if (pw>=2) {return PasswordStrength.WEAK;}
        else return PasswordStrength.INVALID;}}
        
       
        
    }
}