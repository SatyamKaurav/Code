package LearingOOPs.Generics;


public final class Pairuse<S>  {
     S a;
     S b;
    Pairuse(S a,S b){
        this.a=a;
        this.b=b;

    }
    public static void main(String[] args) {
        Pair<Integer> p=new Pair<>(20,10);
        System.out.println(p.getFirst()+" "+p.getSecond());

        Pairuse<String> ps= new Pairuse<>("ab","bc");
        System.out.println(ps.a+" "+ps.b);
    }


}
