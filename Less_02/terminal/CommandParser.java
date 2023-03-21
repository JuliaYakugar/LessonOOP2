package Less_02.terminal;

public class CommandParser implements ICommandParser{

    @Override
    public Command parseCommand(String inputCommand) {
        String[] mas = inputCommand.split(" ");
        switch (mas[1]) {
            case "create": return new Command(mas[0], mas[1], new String[]{mas[2], mas[3], mas[4], mas[5]});
            case "delete": return new Command(mas[0], mas[1]);
        }      
        return null;  
    }

}