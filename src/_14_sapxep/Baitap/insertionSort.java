package _14_sapxep.Baitap;
import java.util.Arrays;
public class insertionSort {
    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--){
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int[] array = {5,63,4,123,-21,4,32,-8};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

}
