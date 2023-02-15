package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int count = 0;
        int skipped = 0;

        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skipped += i;
            } else {
                count += i;
            }
        }

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            System.out.println( "skipped sum is " + skipped);
            System.out.println("counted sum is " + count);
        }
    }
}
