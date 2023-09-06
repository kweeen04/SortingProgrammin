
import Common.Library;
import controller.SortProgram;
import model.Element;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setArr_size(library.getInt("Enter array size: ", 1, 100));
        element.setArray(library.createArray(element.getArr_size()));
        new SortProgram(element).run();
    }

}
