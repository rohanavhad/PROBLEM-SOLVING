public class large {
    public static int larg(int arr[]){
        int max=arr[0];
        int idx=-1;
        for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
            max=arr[i];
            idx=i;
           }
        }
        System.out.println(idx);
        return max;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33};
        System.out.println(larg(arr));
    }
}
