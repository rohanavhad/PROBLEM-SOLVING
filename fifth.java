//both 5&6
public class fifth {
    public static char occ(String s){
        int max=1;
        char a=' ';
        
        for(int i=0;i<s.length();i++){
            int count=1;
            for (int j = 0; j < s.length(); j++) {
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    count+=1;
                    
                }
            }
            if(count>max){
                a=s.charAt(i);
            }
            max=Math.max(max, count);
        }
        return a;
    }
    public static void main(String[] args) {
        String s="abcaddd";
        System.out.println(occ(s));
    }
}
