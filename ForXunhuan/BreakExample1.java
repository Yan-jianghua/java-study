package java.learning.ForXunhuan;

public class BreakExample1 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5, 8, 1};
        int target = 9;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("找到目标值 " + target + "，位置在索引 " + i);
                break;  // 找到后立即退出循环，不再继续查找
            }
            System.out.println("检查数字: " + numbers[i]);
        }
    }
}