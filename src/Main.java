import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {

    public static void main(String[] args) throws Exception {
        int[] randomNumbers = generateRandomNumbers(30, 0, 100);

        System.out.println("random array of numbers");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        BST bst = new BST();

        for (int i = 0; i < randomNumbers.length; i++) {
            bst.insert(randomNumbers[i]);
        }

        System.out.print("\n");
        System.out.print("\n");
        System.out.println("BINARY SEARCH TREE from random");
        bst.visualize();


        AVLTree avlTree = new AVLTree();

        for (int i = 0; i < randomNumbers.length; i++) {
            avlTree.insert(randomNumbers[i]);
        }


        System.out.print("\n");
        System.out.print("\n");
        System.out.println("AVL BALANCED TREE from random");
        avlTree.visualize();


        BinaryHeap binaryHeap = new BinaryHeap();
        for (int i : randomNumbers){
            binaryHeap.Insert(i);
        }


        System.out.print("\n");
        System.out.print("\n");
        System.out.println("BINARY HEAP TREE from random");
        binaryHeap.Print();


        List<Integer> sorted_arr = new ArrayList<>();


        for (int i : randomNumbers){
            sorted_arr.add(binaryHeap.getElement(0));
            binaryHeap.Delete();
        }


        System.out.print("\n");
        System.out.print("\n");
        System.out.println("BINARY SORTED LIST from random");
        System.out.println(sorted_arr);
    }

    public static int[] generateRandomNumbers(int count,int min,int max){
        if ((max - min + 1)< count){
            throw new IllegalArgumentException("Range is smaller that the count");
        }


        List<Integer> numbers = new ArrayList<>();
        for (int i = min; i<= max; i++){
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        int[] result = new int[count];
        for (int i = 0; i < count; i++){
            result[i] = numbers.get(i);
        }

        return result;
    }
}