package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = (number - thousands * 1000) / 100;
        int dozens = (number - thousands * 1000 - hundreds * 100) / 10;
        int ones = number % 10;
        int sum = thousands + hundreds + dozens + ones;
        System.out.println(sum);
    }

}
