public class Recusrion2 {
   public static String removeX(String s){
       if (s.length()==0){
           return "";
       }
       if (s.charAt(0)=='x'){
           return(removeX(s.substring(1)));
       }else{
           s = s.charAt(0)+removeX(s.substring(1));
           return s;
       }
   }
public static String Replace(String s,char a,char b){
       if (s.length()<=1){return s;}

       String smalloutput=Replace(s.substring(1),a,b);
       if (s.charAt(0)==a){
           return b+smalloutput;

       }else {
           return s.charAt(0)+smalloutput;
       }
}
    public static void main(String[] args) {
        String s="xadaxassfx";
        System.out.println(removeX(s));
        System.out.println(Replace(s,'x','a'));
    }
}
