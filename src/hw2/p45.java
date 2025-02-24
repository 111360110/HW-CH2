package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入5個人的分數: ");
        int[] test = new int[5];
        for (int i = 0; i < test.length; i++) {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // 以下為氣泡排序
        for (int s = 0; s < test.length - 1; s++) {
            for (int t = s + 1; t < test.length; t++) {
                if (test[t] > test[s]) {
                    int tmp = test[t];
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + test[i]);
        }
    }
}