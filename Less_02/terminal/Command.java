package Less_02.terminal;

public class Command {
    
    private String command;

    private String animal;

    private String[] parameters;

    public Command(String animal, String command, String[] parameters) {
        this.command = command;
        this.animal = animal;
        this.parameters = parameters;
    }

    public Command(String animal, String command) {
        this.command = command;
        this.animal = animal;
    }

    public String getCommandString() {
        return command;
    }

    public String getAnimal() {
        return animal;
    }

    public String[] getParameters() {
        return parameters;
    }

    public boolean isCreateLion() {
        return command.equals("create")&&animal.equals("lion");
    }

    public boolean isCreateWolf() {
        return command.equals("create")&&animal.equals("wolf");
    }

    public boolean isCreateSnake() {
        return command.equals("create")&&animal.equals("snake");
    }

    public boolean isDeleteLion() {
        return command.equals("delete")&&animal.equals("lion");
    }

    public boolean isDeleteWolf() {
        return command.equals("delete")&&animal.equals("wolf");
    }

    public boolean isDeleteSnake() {
        return command.equals("delete")&&animal.equals("snake");
    }
    
}
