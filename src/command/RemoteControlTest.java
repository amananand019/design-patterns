package command;

import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.objects.Light;
import command.remote.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remote.setCommand(lightOnCommand, lightOffCommand);

        System.out.println(light.getStatus());
        remote.onButtonWasPressed();
        System.out.println(light.getStatus());
        remote.offButtonWasPressed();
        System.out.println(light.getStatus());
    }
}
