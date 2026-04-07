public class Problem6 {

    static int floor(int[] arr, int x) {
        int res = -1;
        for (int val : arr)
            if (val <= x)
                res = val;
        return res;
    }

    static int ceil(int[] arr, int x) {
        for (int val : arr)
            if (val >= x)
                return val;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        System.out.println("Floor: " + floor(arr, 30));
        System.out.println("Ceil: " + ceil(arr, 30));
    }
}