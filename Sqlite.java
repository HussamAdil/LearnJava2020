public class Sqlite extends  Services implements Connecter  {
    public DbType dbType;
public Sqlite()
{
    DbType dbT =  DbType.SQLLITE;
    this.dbType = dbT ;
}

    public DbType getDbType() {
        return dbType;
    }

    @Override
    public void connect() {
        System.out.println("connect to sqlite");
    }
    @Override
    public void read() {
        System.out.println("connect to sqlite");
    }
    @Override
    public void insert() {
        System.out.println("insert from  sqlite");
    }

    @Override
    public void select() {
        System.out.println("select from  sqlite");
    }

    @Override
    public void update() {
        System.out.println("update from  sqlite");
    }

    @Override
    public void delete() {
        System.out.println("delete from  sqlite");
    }
}
