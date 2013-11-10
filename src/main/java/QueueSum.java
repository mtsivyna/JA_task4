/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 11/7/13
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueueSum {
    /**
     Current method is used for summation queue elements and display result
     */

    public int getSum () {

        Queue newArray = new ArrayQueue(2);
        newArray.addElement(4);
        newArray.addElement(4);
        newArray.addElement(4);

        int sum = 0;        // Result sum value

            for (int value : newArray.getArray()) {

                sum += value;
            }

        return sum;
    }
}
