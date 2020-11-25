package Bridge.Database;

import java.util.Scanner;

public interface AbstractDatabase {
    String hello();
}
class WordpressDatabase implements AbstractDatabase{
    @Override
    public String hello() {
        return "Wordpress database";
    }
}
class ShopDatabase implements AbstractDatabase{
    @Override
    public String hello() {
        return "Shop database";
    }
}
abstract class DatabaseConnector{
    protected AbstractDatabase database;
    protected DatabaseConnector(AbstractDatabase database){
        this.database = database;
    }
    public abstract void connect();
}
class MySqlConnector extends DatabaseConnector{
    protected MySqlConnector(AbstractDatabase database) {
        super(database);
    }

    @Override
    public void connect() {
        System.out.println("Mysql connection to "+database.hello());
    }
}
class MariaDBConnector extends DatabaseConnector{

    protected MariaDBConnector(AbstractDatabase database) {
        super(database);
    }

    @Override
    public void connect() {
        System.out.println("MariaDB connection to "+database.hello());
    }
}
class DatabaseFacade{
    private DatabaseConnector databaseConnector = null;
    public DatabaseFacade(){
        Scanner scanner = new Scanner(System.in);
        while(databaseConnector == null){
            System.out.println("Choose connection type");
            String dbConnector = scanner.nextLine();
            System.out.println("Choose database type");
            String database = scanner.nextLine();
            switch((dbConnector+" "+database).toLowerCase()){
                case "mysql wordpress":
                    databaseConnector = new MySqlConnector(new WordpressDatabase());
                    break;
                case "mysql shop":
                    databaseConnector = new MySqlConnector(new ShopDatabase());
                    break;
                case "mariadb wordpress":
                    databaseConnector = new MariaDBConnector(new WordpressDatabase());
                    break;
                case "mariadb shop":
                    databaseConnector = new MariaDBConnector(new ShopDatabase());
                    break;
                default:
                    System.out.println("Bad connection or database type");
            }
        }
    }
    public void connect(){
        if(databaseConnector != null)
            databaseConnector.connect();
    }
}
class Client{
    public static void main(String[] args){
        DatabaseFacade databaseFacade;
        for (int i = 0; i < 4; i++) {
            databaseFacade = new DatabaseFacade();
            databaseFacade.connect();
        }
    }
}

