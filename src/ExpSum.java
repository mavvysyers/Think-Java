public class ExpSum {
    public static void expSum(double x) {
        double expSum = (x * Math.exp(-x)) + Math.sqrt(1 - Math.exp(-x));
        System.out.println(expSum);
    }
    public static void main(String[] args) {
        expSum(5);
    }

}
