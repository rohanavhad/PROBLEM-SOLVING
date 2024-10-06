public class eight {
    public static int m1(int arr[]) {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                
            
            
            sum+=arr[j];
            if(sum>max){
                max=sum;
            }
        }
    }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,-3,4,5};
        System.out.println(m1(arr));
    }
}
