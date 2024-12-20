import java.util.Scanner;
//输出二维数组
public class test1 {
    public static void main(String[] args) {
        // 创建一个4行5列的二维数组
        int[][] Arr = new int[4][5];
        int num = 1;
        // 外层循环控制行
        for (int i = 0; i < 4; i++) {
            // 内层循环控制列
            for (int j = 0; j < 5; j++) {
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                Arr[i][j] = num;

            }
        }
        // 输出二维数组中的元素
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

