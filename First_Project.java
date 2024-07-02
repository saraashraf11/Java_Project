/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_project;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Qaiaty Store
 */
public class First_Project {
    public static void main(String[] args) {
        Scanner elem = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter The Size: ");
        int size = s.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter The Element: ");
            int element = elem.nextInt();
            list.add(element);
        }
        System.out.println("The List = " + list);
        
        // MergeSort
        MergeSort sorter1 = new MergeSort();
        sorter1.sort(list);
        System.out.println("Sorted list (MergeSort): " + list);
        
        // QuickSort
        QuickSort sorter2 = new QuickSort();
        sorter2.sort(list);
        System.out.println("Sorted list (QuickSort): " + list);
        
    }
}
