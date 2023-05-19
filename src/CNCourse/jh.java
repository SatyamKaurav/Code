public class jh {

    public static void main (String[] args) {
         int arr[] = {1, 2,2, 1,3,3, 5,4, 5};

         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                 return;
                 }else{
                     System.out.println(arr[i]);
                 }
             }
         }


    }


}
