public class ToStringMethod {
    int id;
    String name;

    ToStringMethod(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        ToStringMethod obj = new ToStringMethod(1, "Alok");
        System.out.println(obj);
    }

}
