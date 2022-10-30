package accessModifier.publicMembers;

public class Test {

    public static void main(String[] args) {
        PublicMembers members = new PublicMembers();
        System.out.println(members.id);
        System.out.println(members.name);

        members.printID();
        members.printName();

    }
}
