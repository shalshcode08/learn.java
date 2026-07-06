
public class Test {

    public enum DataTypes {
        BYTE,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        CHAR,
        BOOLEAN
    }

    public static void DataTypesRange(DataTypes dataType) {
        switch (dataType) {
            case BYTE:
                System.out.println("BYTE");
                System.out.println("Min Value - " + Byte.MIN_VALUE);
                System.out.println("Max Value - " + Byte.MAX_VALUE);
                break;

            case SHORT:
                System.out.println("SHORT");
                System.out.println("Min Value - " + Short.MIN_VALUE);
                System.out.println("Max Value - " + Short.MAX_VALUE);
                break;

            case INT:
                System.out.println("INT");
                System.out.println("Min Value - " + Integer.MIN_VALUE);
                System.out.println("Max Value - " + Integer.MAX_VALUE);
                break;

            case LONG:
                System.out.println("LONG");
                System.out.println("Min Value - " + Long.MIN_VALUE);
                System.out.println("Max Value - " + Long.MAX_VALUE);
                break;

            case FLOAT:
                System.out.println("FLOAT");
                System.out.println("Min Value - " + Float.MIN_VALUE);
                System.out.println("Max Value - " + Float.MAX_VALUE);
                break;

            case DOUBLE:
                System.out.println("DOUBLE");
                System.out.println("Min Value - " + Double.MIN_VALUE);
                System.out.println("Max Value - " + Double.MAX_VALUE);
                break;

            case CHAR:
                System.out.println("CHAR");
                System.out.println("Min Value - " + (int) Character.MIN_VALUE);
                System.out.println("Max Value - " + (int) Character.MAX_VALUE);
                break;

            case BOOLEAN:
                System.out.println("BOOLEAN");
                System.out.println("Boolean has only two values: true and false");
                break;

            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        System.out.println("Below are the data type and the min and max values it can use");
        System.out.println("-----------");

        DataTypesRange(DataTypes.BYTE);
        DataTypesRange(DataTypes.SHORT);
        DataTypesRange(DataTypes.INT);
        DataTypesRange(DataTypes.LONG);
        DataTypesRange(DataTypes.FLOAT);
        DataTypesRange(DataTypes.DOUBLE);
        DataTypesRange(DataTypes.BOOLEAN);
        DataTypesRange(DataTypes.CHAR);

        System.out.println("-----------");
    }
}
