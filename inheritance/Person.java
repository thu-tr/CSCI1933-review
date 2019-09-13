public class Person {
    protected String first;
    protected String last;
    public static int bbCounter = 0;

    public Person(){}

    public Person(String f, String l){
        first = f;
        last = l;
    }

    public String getFirst(){ return first;}

    public String getLast() {return last;}

}
