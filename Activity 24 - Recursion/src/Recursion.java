public class Recursion {
    public static void countDown(int num) {
        if (num == 0)
            System.out.println("Blast off!");
        else {
            System.out.printf("%d...", num);
            countDown(num - 1);
            //prefix:   countDown(--num) would be the same
            //postfix:  countDown(num--) would forever recur with num and eventually break
        }
    }

    public static void alphaBackwards(char letter) {
        System.out.printf("%c ", letter);
        if (letter != 'a')
            alphaBackwards((char)(letter - 1));
            //prefix:   alphaBackwards(--letter) would be the same
            //postfix:  alphaBackwards(letter--) would forever recur with letter and eventually break
    }

    // the key to the broken postfixes is that we're not returning anything,
    // so the postfix will never happen because the value never gets returned up the recursion ladder.
}
