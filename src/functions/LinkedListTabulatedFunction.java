package functions;

public class LinkedListTabulatedFunction {

    public LinkedList ValuesArray;

    public TabulatedFunction(double leftX, double rightX, double[] values){
        if(leftX >= rightX || values.length < 2){
            throw new IllegalArgumentException();
        }else {

            double size = ((rightX - leftX) / (values.length));

            for (int i = 0; i < values.length; i++) {
                this.ValuesArray[i] = new FunctionPoint(leftX + i * size, values[i]);
            }

            AvailableNumberOfPoints = values.length;
        }
    }


}
