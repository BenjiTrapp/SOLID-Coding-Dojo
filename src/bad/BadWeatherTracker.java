package bad;

public class BadWeatherTracker {
    private String currentCondition;
    private BadMobileDevice badMobileDevice;
    private BadMessengerClient badMessengerClient;

    public BadWeatherTracker() {
        badMobileDevice = new BadMobileDevice();
        badMessengerClient = new BadMessengerClient();
    }

    String getCurrentCondition(){
        return this.currentCondition;
    }

    void setCurrentConditions(String weatherDescription) {
        this.currentCondition = weatherDescription;

        if (currentCondition.equals("rainy")) {
            String alert = badMobileDevice.generateWeatherAlert(currentCondition);
            System.out.print(alert);
        }

        if (currentCondition.equals("sunny")) {
            String alert = badMessengerClient.generateWeatherAlert(currentCondition);
            System.out.print(alert);
        }
    }
}
