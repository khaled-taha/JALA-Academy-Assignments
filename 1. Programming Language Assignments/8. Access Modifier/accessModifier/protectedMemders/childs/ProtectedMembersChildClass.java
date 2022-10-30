package accessModifier.protectedMemders.childs;

import accessModifier.protectedMemders.ProtectedMembers;

public class ProtectedMembersChildClass extends ProtectedMembers {



    public static void main(String[] args) {
        ProtectedMembersChildClass members = new ProtectedMembersChildClass();
        System.out.println(members.id);
        System.out.println(members.name);

        members.printID();
        members.printName();
    }
}
