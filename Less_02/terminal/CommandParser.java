package Less_02.terminal;

public class CommandParser implements ICommandParser{

    @Override
    public String[] parseCommand(String inputCommand) {
        return inputCommand.split(" ");
    }

}