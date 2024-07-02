/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first_project;
import java.util.ArrayList;
/**
 *
 * @author Qaiaty Store
 */
public class MergeSort implements Sortable{
    
    @Override
    public void sort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();

            int mid = list.size() / 2;
            for (int i = 0; i < mid; i++) {
                left.add(list.get(i));
            }
            for (int i = mid; i < list.size(); i++) {
                right.add(list.get(i));
            }

            sort(left);
            System.out.println("left: "+left);
            sort(right);
            System.out.println("right: "+right);
            merge(list, left, right);
        }
    
    }
            
    private void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int l = 0, r = 0, index = 0;

       while (l < left.size() && r < right.size()) {
            if (left.get(l) > right.get(r)) { 
                list.set(index++, left.get(l++));
            } else {
                list.set(index++, right.get(r++));
            }
        }

        while (l < left.size()) {
            list.set(index++, left.get(l++));
        }

        while (r < right.size()) {
            list.set(index++, right.get(r++));
        }
    }
}
