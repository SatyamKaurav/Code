package CNCourse;

public class Recuriosii {
    public static int BinarySearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int MidIndex=(si+ei)/2;

        if (a[MidIndex]==x) {
            return MidIndex;

        } else if (a[MidIndex]<x) {
            return BinarySearch(a,MidIndex+1,ei,x);

        }else {
            return BinarySearch(a,si,MidIndex-1,x);
        }
    }
    public static void towerHanoi(int n,char s,char h,char d){
        if(n==1){
            System.out.println("move 1st disk from "+s+" to "+d);
            return;
        }
        towerHanoi(n-1,s,d,h);
        System.out.println("move"+n+" th disk from "+s+" to "+d);
        towerHanoi(n-1,h,s,d);
    }
    public static void main(String[] args) {
//        int a[]={1,2,4,5,7,8,9};
//        System.out.println(BinarySearch(a,0,6,9));
    towerHanoi(4,'s','h','d');

    }
}

