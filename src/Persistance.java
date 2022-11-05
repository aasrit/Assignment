 abstract class Persistance {
    abstract void persist();
}
class FilePersistance extends Persistance {
    void persist() {
        System.out.println("Data is stored in files");
    }
}
class DatabasePersistance extends Persistance {
    @Override
    void persist() {
        System.out.println("data is stored in Database");
    }
}
class Data
{
    public static void main(String[] args) {
        FilePersistance fp=new FilePersistance();
        DatabasePersistance dp=new DatabasePersistance();
        fp.persist();
        dp.persist();
    }
}
