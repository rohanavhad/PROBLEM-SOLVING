public class lis {
    public static int LIS(int arr[]) {
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,3,2,1};
        System.out.println(LIS(arr));
    }
}
