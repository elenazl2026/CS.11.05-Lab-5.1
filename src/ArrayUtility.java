import java.text.DecimalFormat;

public class ArrayUtility {

    public static void print(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);

            if (i < array.length - 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb.toString());
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        average = Math.floor(average * 100) / 100; // Round down to two decimal places

        return average;
    }

    public static int minimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array mustn't be empty");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String element : array) {
            if (element.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        if (array.length == 0) {
            return "";
        }

        String result = String.valueOf(array[0]);

        for (int i = 1; i < array.length; i++) {
            result += ",";
        }

        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length < 2) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length < 2) {
            return; // No need to shift if array has 0 or 1 element
        }

        int firstElement = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length < 2 || n % array.length == 0) {
            return;
        }
        int shifts = n % array.length;

        for (int shift = 0; shift < shifts; shift++) {
            int lastElement = array[array.length - 1];

            for (int i = array.length - 2; i >= 0; i--) {
                array[i + 1] = array[i];
            }

            array[0] = lastElement;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {

        if (array.length < 2 || n % array.length == 0) {
            return; // No need to shift if array has 0 or 1 element or if its multiple of array length
        }
        int shifts = n % array.length; // Calculate shifts

        for (int shift = 0; shift < shifts; shift++) {
            int firstElement = array[0];

            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }

            array[array.length - 1] = firstElement;
        }
    }

}
