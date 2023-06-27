public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {

        /*Changing the data type from int to double to avoid
        truncation of the division result*/
        double total = 0.0;
        for (int num : numbers) {
            total += num;
        }
        
        //Refactoring redundant code to produce cleaner code
        return total / numbers.length;
    }
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}