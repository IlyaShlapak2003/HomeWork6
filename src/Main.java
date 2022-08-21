public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Задание 1
        int sum=0;
        for (int i = 0; i < 30; i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        // Задание 2
        int maxSpending = 0;
        int minSpending = 200_001;
        for (int i = 0; i < 30; i++) {
            if (arr[i]>maxSpending){
                maxSpending=arr[i];
            }
            if (arr[i]<minSpending){
                minSpending=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending +" рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
        // Задание 3
        //Возьмем сумму из задания 1
        double sumS=sum;
        double average= sumS/30;
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");
        // Задание 3
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}