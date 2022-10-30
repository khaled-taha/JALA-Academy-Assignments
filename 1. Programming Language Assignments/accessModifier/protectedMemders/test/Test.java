package accessModifier.protectedMemders.test;

import accessModifier.protectedMemders.childs.ProtectedMembersChildClass;

public class Test {

    public static void main(String[] args) {
        ProtectedMembersChildClass members = new ProtectedMembersChildClass();
        /*
        * Cannot access the protected member outside its package and the child
        * */
    }
}
