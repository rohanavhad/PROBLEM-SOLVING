public class second {
    public static int h1(int arr[],int n){
        
         for (int i = 1; i< arr.length-2; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return arr[i];
            }
         }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};
        int n=arr.length;
        System.out.println(h1(arr, n));
    }
}
