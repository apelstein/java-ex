public class Inherit {

    private class Y{
        public Y(){
            System.out.println("in Y");
        }
    }

    private Y y = new Y();

    public Inherit(){
        System.out.println("in constructor");
    }
}
