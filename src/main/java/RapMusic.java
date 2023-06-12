
public class RapMusic implements Music {
    public void doInit() {
        System.out.println("initialization");
    }
    public void doDestroy() {
        System.out.println("destruction");
    }
    public String getSong() {
        return "Skryptonyte - Vecherinka";
    }
}
