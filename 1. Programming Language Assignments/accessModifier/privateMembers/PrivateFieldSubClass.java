package accessModifier.privateMembers;

public class PrivateFieldSubClass extends PrivateField{


    public static void main(String[] args) {
        PrivateFieldSubClass privateFieldSubClass = new PrivateFieldSubClass();
        /*
        * Cannot access the private members in the parent class because they are not inherited as their scope is
        * the class of them (PrivateField)
        * */
    }
}
