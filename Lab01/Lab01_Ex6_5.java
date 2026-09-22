public class Lab01_Ex6_5 {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 5, 67, 23, 89, 1, 45, 36};
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
