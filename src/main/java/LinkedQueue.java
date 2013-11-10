/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 11/5/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedQueue {

    Queue newArray = new ArrayQueue(5);

    void addElement() {

        newArray.addElement(4);
        newArray.addElement(4);
        newArray.addElement(4);

        for (int i = 0; i < 5; i++) {

            System.out.println("---" + newArray.getArray()[i]);
        }
    }
}