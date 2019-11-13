public class Main {

    public static void main(String[] args) {
        CountElement yo = new CountElement("a");
        System.out.println(yo.counter(yo.getSourceOfElements(), yo.getElementToSearch()));
    }
}
