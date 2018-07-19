public class insertionSort {
  public static void main(String[] args){
    int[] arr = {5, 2, 4, 6, 1, 3, 44};
    System.out.print("Array before being sorted: ");
    for (int i:arr) {
        System.out.print(i + " ");
    }
    System.out.println();

    for (int j = 1; j < arr.length; j++) {
        int key = arr[j];
        int i = j - 1;

        while (i >= 0 && arr[i] > key){
            arr[i + 1] = arr[i];
            i = i - 1;
        }
        arr[i + 1] = key;
    }

    // 1st iteration
    // j = 1; i = 0;
    // arr[i] = 5; key = 2; condition is true
    // arr[i + 1] = arr[i]; => arr[1] = arr[0]; => the values are swapped and arr[1] = 5;
    // i = -1;
    // arr[i + 1] = 2; => arr[0] = 2

    System.out.print("Array after being sorted: ");
    for (int i:arr) {
        System.out.print(i + " ");
    }
    System.out.println();
  }
}
