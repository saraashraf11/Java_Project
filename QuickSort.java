/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first_project;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Qaiaty Store
 */
public class QuickSort implements Sortable{
    @Override
    public void sort(ArrayList<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (list.get(j) > pivot) { // Sorting in descending order
                i++;
                Collections.swap(list, i, j);
            }
        }

        Collections.swap(list, i + 1, high);

        return i + 1;
    }
}
