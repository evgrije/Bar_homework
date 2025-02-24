public class TesterAlcohol extends Staff{
    private boolean isHealthy;

    public TesterAlcohol(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
