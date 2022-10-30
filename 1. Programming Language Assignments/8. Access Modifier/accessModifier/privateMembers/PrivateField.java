package accessModifier.privateMembers;

public class PrivateField {
    private int id = 1;

    private void printId(){
        System.out.println(id);
    }

    public static void main(String[] args) {
        PrivateField privateField = new PrivateField();
        System.out.println(privateField.id);
        privateField.printId();
    }

}
