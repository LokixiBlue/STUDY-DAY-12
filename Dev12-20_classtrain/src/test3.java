public class test3 {
    public static void main(String[] args) {
        // 杨辉三角
        //先创建一个数组用来存储杨辉三角的结果
        int[][] arr = new int[6][6];
        //外循环列
        for (int i = 0; i < 6; i++) {
            //内循环行
            for (int j = 0; j <= i; j++) {  // 将内层循环条件修改为 j <= i，确保每行元素都能处理到
                //如果下标是在第一个，还有i结束位置的最后一个，就为1
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    //arr[i - 1][j - 1] + arr[i - 1][j]的意思为“上一列前一个数 加 后一个数的值”
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        // 输出杨辉三角
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}