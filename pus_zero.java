public class pus_zero {
    public static void  arr1 (int arr[]) {
        int ar[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ar[count++]=arr[i];
            }
        }
        for (int j=count; j < ar.length; j++) {
            ar[count++]=0;
        }
        for (int i : ar) {
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,0,0,0,5,2};
        arr1(arr);
    }
}
