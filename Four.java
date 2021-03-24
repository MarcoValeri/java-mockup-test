public class Four {
    
    public static void printRuns(String[] v) {

        if (v.length == 0) return;

        String before = v[0];
        int repeat = 1;

        for (int i = 1; i < v.length; i++) {

            if (before.equals(v[i])) {
                repeat++;
            } else {
                if (repeat > 1) {
                    System.out.print("(" + repeat + " " + before + ") ");
                } else {
                    System.out.print(before + " ");
                }
                before = v[i];
                repeat = 1;
            }

            if (repeat < 1) {
                before = v[i];
                repeat = 1;  
            } 

            if (i == (v.length - 1)) {
                System.out.println(v[i]);
            }

        }

    };

    public static void main(String[] args) {

        String[] arr = { "a", "b", "e", "e", "c", "a", "a", "a", "b", "d", "c", "b", "b", "b", "b", "c", "f", "e", "e", "c", "a" };
        printRuns(arr);

    }

}
