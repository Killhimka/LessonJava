package JC2.Array.HwArray;

public class DZ8 {
    public static void findUnique(int[] a){
        for (int i = 0; i < a.length; i++) {
            boolean isUnique=false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]){
                    isUnique=true;
                    break;
                }
            }
            if (!isUnique){
                System.out.println(a[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1,5,3,3,5,12,18,12,21,81,18};
        findUnique(arr);
    }
}
