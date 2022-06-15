package p20_Annotations.BookExamples.annotations.database;

public class TableCreator {
    public static void main(String[] args) throws Exception{
        if (args.length < 1) {
            System.out.println("argument: annotated classes");
            System.exit(0);
        }
        for (String className : args) {
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("No DBTable annotations in class " + className);
                continue;
            }
            String tableName = dbTable.name();
            // Если имя не указано - использовать имя Class
        }
    }
}
