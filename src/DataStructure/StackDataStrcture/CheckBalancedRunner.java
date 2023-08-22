package DataStructure.StackDataStrcture;

public class CheckBalancedRunner {
    public static void main(String[] args) {
        String inputStr="[{(a+b)a*b}]";
        System.out.println(CheckBalanced.checkBalance(inputStr));
    }
}
