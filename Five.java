public class Five {
    
    public static double[] product(double[] v1, double[] v2) {

        // Check if the arryas have the same length
        // If they have not the same length check with array is longer
        int newArrayLength = 0;
        if (v1.length > v2.length) {
            newArrayLength = v1.length;
        } else {
            newArrayLength = v2.length;
        }

        // Declare new array where saving the computer required
        double[] newArr = new double[newArrayLength];

        // Loop through the array to have the compute required
        for (int x = 0; x < newArr.length; x++) {
            newArr[x] = v1[x] * v2[x];
        }

        return newArr;

    }

    public static void main(String[] args) {

        double[] v1 = { 5, 2, 3 };
        double[] v2 = { -1, 2, 0 };
        double[] v3 = product(v1, v2);

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

    }

}
