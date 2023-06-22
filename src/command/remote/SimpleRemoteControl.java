package command.remote;

import command.commands.Command;

public class SimpleRemoteControl {
    Command onCommand;
    Command offCommand;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonWasPressed() {
        onCommand.execute();
    }

    public void offButtonWasPressed() {
        offCommand.execute();
    }
}
