public class VariableScopes {

    int id = 1; // global variable

    public void setId(int id /*local variable*/) {
        this.id = id;
    }
}
