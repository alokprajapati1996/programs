import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class CollectionArray {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Shilpi Pal");
        list.add("Neha Mourya");
        list.add("Prince Verma");
        list.add(78808021);
        list.add(7.9);

        System.out.println(list);
        LinkedList list1 = new LinkedList();
        list1.add("Anuj");
        list1.add("roshni pal");
        System.out.println(list1);
        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
