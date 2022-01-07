package exception;
class Node{
    public int add(int m,int n) throws myException {
        if (m==10){
            throw new myException("m=10了----");
        }
        return m+n;
    }
}
public class myException extends Exception{
    public myException(String message){
        super(message);
    }

    public static void main(String[] args) {
        int m=10;
        try{
            Node node = new Node();
            node.add(10,12);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
    }
}
