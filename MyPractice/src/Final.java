public class Final {
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8

    }

    static final double avgElements(int[] array) {//adding static in order to get the value from static method
        double sum = 0;
       double average = 0;
        for (int i = 0; i <array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }
            return average;


        }
    }









