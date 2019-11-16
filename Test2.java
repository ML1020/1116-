import java.util.Scanner;

//判断是否为回文数
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;
        for (int i =0;i <= str1.length();i++){
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);  //某个位置插入某个字符串
            if (isHuiwen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isHuiwen(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
