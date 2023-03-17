package Less_02.terminal;

import java.util.ArrayList;
import java.util.Scanner;

import Less_02.cage.LionCage;
import Less_02.cage.SnakeTerrarium;
import Less_02.cage.WolfCage;
import Less_02.zoo.Zoo;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private ICommandParser commandParser;
    private CommandExecutableFactory factory;
    
    private TerminalReader(ICommandParser commandParser) {
        this.commandParser = commandParser;

        WolfCage wolfCage = new WolfCage();
        LionCage lionCage = new LionCage();
        SnakeTerrarium snakeTerrarium = new SnakeTerrarium();
        Zoo zoo = new Zoo(wolfCage, lionCage, snakeTerrarium);


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

            CommandExecutable ce = factory.create(commandParser.parseCommand(input));
            ce.execute();



        }
        scanner.close();
    }
    
}
