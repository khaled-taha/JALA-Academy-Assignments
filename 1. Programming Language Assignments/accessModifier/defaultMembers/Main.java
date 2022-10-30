package accessModifier.defaultMembers;

public class Main {

    public static void main(String[] args){
        DefaultMembers members = new DefaultMembers();
        System.out.println(members.id);
        System.out.println(members.name);

        members.printID();
        members.printName();
    }
}
