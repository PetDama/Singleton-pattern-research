public class Singleton {
    private static Singleton instance;

    // Constructor privat pentru a împiedica crearea directă de instanțe
    private Singleton() {}

    // Metodă pentru a obține instanța Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
