package controller;

import Common.Library;
import Common.Algorithm;
import model.Element;
import view.Menu;

public class SortProgram extends Menu<String> {

    static String[] mc = {"Sort", "Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int arr_size;

    public SortProgram(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        arr_size = element.getArr_size();
        array = element.getArray();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                sort();
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
        }
    }

    public void sort() {
        final String[] mcSort = {"Bubble Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Options: ", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted Array: ");
                library.display(array);
                switch (n) {
                    case 1:
                        algorithm.bubbleSort(array);
                        System.out.println("\nSorted array in Bubble Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, arr_size - 1);
                        System.out.println("\nSorted array in Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
