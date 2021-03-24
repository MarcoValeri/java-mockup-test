public class One {
    
    public static void main(String[] args) {
        
        int p = 3;
        for (int n = 2; p < 50; n += 3) {
            p += n;
        }
        System.out.println(p);

    }

}

/*
p	n	p < 50
3	2	TRUE
5	5	TRUE
10	8	TRUE
18	11	TRUE
29	14	TRUE
43	17	TRUE
60		FALSE
*/