package school.hei;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        throws Exception {

            ApplicationContext context = SpringApplication.run(ConnectionApplication.class, args);

            DatabaseConfig dbConfig = context.getBean(DatabaseConfig.class);


            System.out.println("DB URL = " + dbConfig.getDbUrl());
            System.out.println("DB Username = " + dbConfig.getDbUsername());

            var conn = dbConfig.getConnection();
            System.out.println("Connection OK ? " + !conn.isClosed());
            conn.close();
        }

    }
}