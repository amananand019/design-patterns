package command.objects;

public class Light {
    private String status = "off";

    public void on() {
        System.out.println("light is on");
        status = "on";
    }

    public void off() {
        System.out.println("Light is off");
        status = "off";
    }

    public String getStatus() {
        return status;
    }
}
