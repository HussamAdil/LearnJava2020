public class Connection {
    public static void main(String[] args) {
        Sqlite sqlite = new Sqlite();
        System.out.println(sqlite.getDbType());
        sqlite.log();
    }
}
