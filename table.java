public class table {
    public static void main(String[] args) {
        int t=3;
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(t*i);
            sum+=t*i;
        }
        System.out.println(sum);
    }
}
