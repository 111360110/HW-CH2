package hw2;

public class p41 {
    public static void main(String[] args) {
        int[] test;
        test = new int[5];
        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        test[10] = 75; // 這行會造成陣列索引超出範圍的錯誤
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
        }
    }
}