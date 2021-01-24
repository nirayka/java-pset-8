import java.util.Arrays;

public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else {
            if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int[] middleman(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 1 || b.length % 2 != 1) {
            return null;
        } else {
            int[] newArray = new int[] {a[a.length/2], b[b.length/2]};
            return newArray;
        }
    }

    public int[] bigger(int[] a, int[] b) {
        if (a == null || b == null) {
            return null;
        } else {
            int sumA = 0;
            int sumB = 0;

            if (a.length != 0) {
                for (int i = 0; i < a.length; i++) {
                    sumA += a[i];
                }
            }
            if (b.length != 0) {
                for (int i = 0; i < b.length; i++) {
                    sumB += b[i];
                }
            }

            if (sumB > sumA) {
                return b;
            } else {
                return a;
            }
        }
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 0 || b.length % 2 != 0) {
            return null;
        } else {
            int[] newArray = new int[] {
                    a[a.length/2-1],
                    a[a.length/2],
                    b[b.length/2-1],
                    b[b.length/2]};
            return newArray;
        }
    }

    public int[] swapMe(int[] a) {
        if (a == null) {
            return null;
        } else {
            int originalLastVal = a[a.length-1];
            a[a.length-1] = a[0];
            a[0] = originalLastVal;
            return a;
        }
    }

    public int[] threePoint(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 1) {
            return null;
        } else {
            int[] newArray = new int[] {a[0], a[a.length/2], a[a.length-1]};
            return newArray;
        }
    }

    public int headHoncho(int[] a) {

    }

    public boolean tippingPoint(int[] a, int threshold) {

    }

    public String halfway(int[] a) {

    }

    public int[] sequential(int[] a, int[] b) {

    }
}
