import java.util.ArrayList;

import java.util.Collections;

public class ComparableProgram implements Comparable<ComparableProgram> {
    int rollno;
    int mobileno;
    String name;

    ComparableProgram(int rollno, String name, int mobileno) {
        this.mobileno = mobileno;
        this.name = name;
        this.rollno = rollno;
    }

    public int compareTo(ComparableProgram cp) {
        if (mobileno == cp.mobileno) {
            return 0;
        } else if (mobileno > cp.mobileno) {
            return 1;
        } else {
            return -1;
        }

    }

    class Student {
        public static void main(String[] args) {
            ArrayList<ComparableProgram> list = new ArrayList<ComparableProgram>();
            list.add(new ComparableProgram(5, "Amit", 7880808));
            list.add(new ComparableProgram(3, "Harshir", 78808012));
            list.add(new ComparableProgram(1, "Umar", 78803280));
            list.add(new ComparableProgram(4, "Gulab", 78823080));
            list.add(new ComparableProgram(2, "Sanam", 78813080));
            System.out.println("before sorting element___________________________________");
            for (ComparableProgram str : list) {
                System.out.println(str.rollno + " " + str.name + " " + str.mobileno);
            }
            Collections.sort(list);
            System.out.println("after sorting_______________________________________");
            for (ComparableProgram cp : list) {
                System.out.println(cp.rollno + " " + cp.name + " " + cp.mobileno);
            }
        }
    }
}