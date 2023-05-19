package CNCourse;

public class Recursion {
    public static String removeX(String s){
        if (s.length()==0){
            return "";
        }
        //recursion

        if (s.charAt(0)=='x'){
            return removeX(s.substring(1));

        }
        else { s=removeX(s.substring(1));
            return s;
        }
    }

    public static void main(String[] args) {
        String s="xaxa";
        System.out.println(removeX(s));
    }
}
