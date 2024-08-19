class DuplicateCounter {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9, 6, 6};
        countDuplicate(arr);
    }

    public static void countDuplicate(int[] array) {
            int[] count = new int[1000];

        for (int num : array) {
            count[num]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println("num " + i + " duplicated " + count[i] + " times");
            }
        }
    }
}