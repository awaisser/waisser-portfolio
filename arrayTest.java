public class arrayTest {
    public static void main(String[] args) {
        ArraySort arraySort1 = new ArraySort();
        System.out.println(arraySort1);
        arraySort1.addElement(5);
        arraySort1.addElement(2);
        arraySort1.addElement(3);
        arraySort1.addElement(6);
        arraySort1.addElement(1);
        arraySort1.addElement(2);
        arraySort1.addElement(-2);
        arraySort1.printArray();
        arraySort1.delete(2);
        arraySort1.printArray();
        System.out.println("Maximum value is " + arraySort1.maximum());
        System.out.println("Minimum value is " + arraySort1.minimum());
        arraySort1.setElement(3, 4);
        arraySort1.printArray();
    }
}
