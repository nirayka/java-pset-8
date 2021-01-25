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
        if (a == null || b == null || a.length % 2 != 1 || b.length % 2 != 1) {
            return null;
        } else {
            int[] newArray = {a[a.length/2], b[b.length/2]};
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
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }

        if (a == null || a.length == 0 || count > 0) {
            return -1;
        } else {
            int largest = 0;
            for (int k = 0; k < a.length; k++) {
                if (a[k] > largest) {
                    largest = a[k];
                }
            }
            return largest;
        }
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if (a == null || threshold == null) {
            return false;
        } else {
            int arraySum = 0;
            for (int i = 0; i < a.length; i++) {
                arraySum += a[i];
            }
            if (arraySum > threshold) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String halfway(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int j = 0; j < a.length/2; j++) {
            leftSum += a[j];
        }

        for (int k = (a.length/2); k < a.length; k++) {
            rightSum += a[k];
        }

        if (leftSum > rightSum) {
            return "LEFT";
        } else {
            return "RIGHT";
        }
    }

    public int[] sequential(int[] a, int[] b) {

    }
}
