package Less_02.terminal;

import java.util.Scanner;

import Less_02.zoo.Zoo;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private ICommandParser commandParser;
    private CommandExecutableFactory factory;
    
    private TerminalReader(ICommandParser commandParser) {
        this.commandParser = commandParser;

        Zoo zoo = new Zoo();
        factory = new CommandExecutableFactory(zoo);
    }

    public static TerminalReader newTerminalReader(ICommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void runReader() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;

            String[] cp = commandParser.parseCommand(input);
            CommandExecutable ce = factory.create(cp);
            ce.execute();



        }
        scanner.close();
    }
    
}
