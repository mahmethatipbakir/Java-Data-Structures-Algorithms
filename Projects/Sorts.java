package DS;

public class Sorts {
    public static void main(String[] args) {
        int[] list = { 8, 5, 7, 6, 1, 9, 13, 2 };

        System.out.println("Bubble Sort: ");
        bubbleSort(list);
        System.out.println("Selection Sort: ");
        selectionSort(list);
        System.err.println("Insertion Sort: ");
        insertionSort(list);
    }

    public static void bubbleSort(int[] list) {
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        double durationInMilliseconds = (double) durationInNano / 1000000;
        System.out.println("İşlem " + durationInMilliseconds + " milisaniye sürdü.");
        System.out.println();
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }

        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        double durationInMilliseconds = (double) durationInNano / 1000000;
        System.out.println("İşlem " + durationInMilliseconds + " milisaniye sürdü.");
        System.out.println();
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        double durationInMilliseconds = (double) durationInNano / 1000000;
        System.out.println("İşlem " + durationInMilliseconds + " milisaniye sürdü.");
        System.out.println();
    }

}
