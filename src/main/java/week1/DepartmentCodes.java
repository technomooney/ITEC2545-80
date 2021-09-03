package week1;

import java.util.Locale;

import static input.InputUtils.stringInput;

public class DepartmentCodes {
    public static void main(String[] args) {
        String departmentCode = stringInput("enter department code:");
        //check for a valid code, ITEC, BTEC, ENGL, MATH
        if (departmentCode.length() == 4){
            System.out.println("the code is valid");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("the code is " + departmentCode);
        }else {
            System.out.println("the code is invalid");
        }
    }
}
