public class E20 {

    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 1 };
        System.out.println(a[h(a, 1)] + 1 == a[h(a, 2)] ? "yes" : "no");
        System.out.println(a[h(a, 2)]);
        System.out.println("h(a, 2) = " + h(a, 2));
        System.out.println("a[1] = " + a[h(a, 2)]);
    }

    public static int h(int[] v, int i) {
        return v[v[i]];
    }

}

/*
Statement
a[h(a, 1)] + 1 = 2 because:
h(a, 1) = 3
a[3] = 1
1 + 1 = 2

a[h(a, 2)] = 2 because:
h(a, 2) = 1
a[2] = 2

if (2 == 2) System.out.println("yes");

*/