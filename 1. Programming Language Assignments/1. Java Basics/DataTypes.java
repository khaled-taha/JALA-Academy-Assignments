public class DataTypes {

    int id = 1;
    boolean adult = true;
    char firstCharacter = 'K';
    float age = 23.5f;
    double salary = 20_000.500;

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        System.out.println(dataTypes.toString());

    }

    @Override
    public String toString() {
        return "DataTypes{" +
                "id=" + id +
                ", adult=" + adult +
                ", firstCharacter=" + firstCharacter +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
