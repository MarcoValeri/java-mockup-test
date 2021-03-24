public class Three {
    
    public static void main(String[] args) {
        
        int d = -1;
        if (d >= 0) if (d == 1) System.out.print("U"); else System.out.print("Z");
        System.out.print("N");

    }

}

/*
#1
int d = 0;
if (d >= 0) is true
if (d == 1) is false 
else System.out.print("Z") runs
System.out.println("N") runs always
Print out ZN

#2
int d = 1;
if (d >= 0) is true
if (d == 1) is true so it runs System.out.println("U")
else does not run
System.out.println("N") runs always
Print out UN

#3
int d = -1;
if (d >= 0) is false so the statement end here
System.out.println("N") runs always
Print out N

*/