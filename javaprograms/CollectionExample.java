import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample implements Comparable<CollectionExample> {
    int rollno;
    int age;

    String name;

    public CollectionExample(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(CollectionExample collectionExample) {
        if (age == collectionExample.age) {
            return 0;
        } else if (age > collectionExample.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class SortCollection {

    public static void main(String[] args) {
        ArrayList<CollectionExample> list = new ArrayList<CollectionExample>();
        list.add(new CollectionExample(1, "Alok", 25));
        list.add(new CollectionExample(2, "manisha", 24));
        list.add(new CollectionExample(4, "Mohitage", 25));
        Collections.sort(list);
        for (CollectionExample str : list)
            System.out.println(str.rollno + " " + str.name + " " + str.age);

    }
}
