package writer;

public class NiceWriter implements IWriter {
    @Override
    public void writer(String s) {
        System.out.println("The String is " + s);
    }
}
