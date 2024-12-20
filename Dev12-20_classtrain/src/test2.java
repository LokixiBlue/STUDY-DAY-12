public class test2 {
    public static void main(String[] args) {
        //矩阵转列
        //首先定义一个三行四列的二维数组b，用来存储转列后的a数组
        int [][]b=new int[3][4];
        //给a数组赋值
        int [][] a={{1,2,3},{4,5,6},{7,8,9},{0,11,12}};
        //内外循环的作用：当i=0,j=1时，b[j][i]=a[i][j]  ==  b[1][0]=a[0][1],等同于是把a第一行第二个数，赋值给b第一列的第一个数，形成转列作用
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[j][i]=a[i][j];
            }

        }
        //循环输出二维数组的结果
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
