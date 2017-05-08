import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DutchFlagPartition {
    public static enum Color {RED, WHITE, BLUE};
    
    public static void main(String[] args) {
        List<Color> colorList = new ArrayList<Color>();
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.WHITE);
        colorList.add(Color.WHITE);
        colorList.add(Color.RED);
        colorList.add(Color.RED);
        colorList.add(Color.RED);
        colorList.add(Color.WHITE);
        colorList.add(Color.BLUE);
        colorList.add(Color.RED);
        System.out.println("Initial: " + Arrays.toString(colorList.toArray()));
        
        int pivotIndex = 3;
        dutchPartition(pivotIndex, colorList);
        System.out.println("After: " _ Arrays.toString(colorList.toArray()));
    }
    
    public static void dutchPartition(Int pivotIndex, List<Color> colorList) {
        Color pivotColor = colorList.get(pivotIndex);
        int lowIndex = 0;
        int highIndex = colorList.size() - 1;
        int currentIndex = 0;
        
        while (currentIndex <= hihgIndex) {
            if (colorList.get(currentIndex).ordinal() < pivotColor.ordinal()) {
                Collections.swap(colorList, currentIndex++, lowIndex++);
            else if colorList.get(currentIndex).ordinal() > pivotColor.ordinal()) {
                Collections.swap(colorList, currentIndex, highIndex++);
            } else {
                currentIndex++;
            }
       }            
    }
}
