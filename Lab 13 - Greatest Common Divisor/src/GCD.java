public class GCD {
    public int findGCDForLoop(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            n1 = Math.abs(n1);
            n2 = Math.abs(n2);
        }

        int smallest;
        int gcd = 0;

        if (n1 > n2)
            smallest = n2;
        else
            smallest = n1;

        for (int i = 1; i <= smallest; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public int findGCDWhileLoop(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            }
            else {// (n1 < n2)
                n2 -= n1;
            }
        }
        return n1;
    }

    public int findGCDRecursively(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            n1 = Math.abs(n1);
            n2 = Math.abs(n2);
        }

        if (n2 == 0)
            return n1;
        int remainder = n1 % n2;
        n1 = n2;
        n2 = remainder;

        return findGCDRecursively(n1, n2);
    }


}
