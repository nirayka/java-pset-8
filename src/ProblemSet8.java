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
            int[] answer = new int[] {a[a.length/2], b[b.length/2]};
            return answer;
        }
    }

    public int[] bigger(int[] a, int[] b) {

    }

    public int[] doubleMiddle(int[] a, int[] b) {

    }

    public int[] swapMe(int[] a) {

    }

    public int[] threePoint(int[] a) {

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
