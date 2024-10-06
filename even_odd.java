public class even_odd {
    public static String odd(int arr[]){
        String v="";
        for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
            v+="even";
         }else{
            v+="odd";
         }
        }
        return v;
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(odd(arr));
    }
}
