public class Intersection {

    public static void main(String[] args) {
        int[] a = new int[] {13, 27, 35, 40, 49, 55, 59};
        int[] b = new int[] {17, 35, 39, 40, 55, 58, 60};

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                System.out.println(b[j]);
                i++;
                j++;
            } else {
                if(a[i] > b[j]) {
                    j++;
                } else if(a[i] < b[j]) {
                    i++;
                }
            }
        }
    }
}
