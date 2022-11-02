import functions.ArrayTabulatedFunction;

public class Main {
    public static void main(String[] args) {


        double left = 0;
        double right = 4;
        double[] val = { -1.0, 1.0 , 3.0 , 5.0};
        ArrayTabulatedFunction fir = new ArrayTabulatedFunction(left, right, val);

        //fir.print();
        //fir.deletePoint(3);
        //FunctionPoint n = new FunctionPoint(4,7);
        //fir.addPoint(n);
        //System.out.println();
        //fir.print();

        //System.out.println(fir.getFunctionValue(4.0));

        //LinkedList list = new LinkedList(left, right, val);

        // Print the LinkedList
        //list.printList(list);

    }
}