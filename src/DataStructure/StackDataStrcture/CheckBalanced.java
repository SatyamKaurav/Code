package DataStructure.StackDataStrcture;

import java.util.Stack;

public class CheckBalanced {
    public static String checkBalance(String inputStr){

//        Stack<Character> s=new Stack<>();
//        for (char i:inputStr.toCharArray()){
//            if (i=='{' ||i=='['||i=='('){
//                s.push(i);
//            }else if (i=='}' ||i==']'||i==')'){
//                if (s.size()>0 && s.peek()==i)
//                    s.pop();
//            }else {
//                return "Unbalanced";
//            }
//
//        }if (s.size() == 0)
//            return "Balanced";
//        else
//            return "Unbalanced";
        Stack<Character> stack=new Stack<Character>();
        for (int j=0;j<inputStr.length();j++)
        {
            char i=inputStr.charAt(j);
            if (i=='[' || i=='{' || i=='(')
            {
                stack.push(i);
            }
            else if(i==']' || i=='}' || i==')')
            {
                if (stack.isEmpty())
                    return "Unbalanced";

                else
                {
                    if (i==']')
                    {
                        if (stack.peek()!='[')
                            return "Unbalanced";
                        else
                            stack.pop();
                    }

                    else if (i=='}')
                    {
                        if (stack.peek()!='{')
                            return "Unbalanced";
                        else
                            stack.pop();
                    }

                    else if (i==')')
                    {
                        if (stack.peek()!='(')
                            return "Unbalanced";
                        else
                            stack.pop();
                    }
                }
            }

        }
        return "Balanced";

    }
}
