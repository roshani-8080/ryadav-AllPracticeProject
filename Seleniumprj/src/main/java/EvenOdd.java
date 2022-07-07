public class EvenOdd {
    int even = 0;
    int odd = 0;

    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19};

        EvenOdd obj = new EvenOdd();

        //  int even = 0;
        // int odd = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                obj.even++;

                System.out.println(arr[i]);

            } else {

                obj.odd++;

                //System.out.println(arr[i]);

            }

        }
        System.out.println(obj.even);
        System.out.println(obj.odd);
    }
}
