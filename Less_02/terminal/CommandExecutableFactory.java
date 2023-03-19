package Less_02.terminal;

import Less_02.zoo.Zoo;

public class CommandExecutableFactory {

    private Zoo zoo;
    private String[] parameters;

    public CommandExecutableFactory(Zoo zoo){
        this.zoo = zoo;
    }

    public CommandExecutable create (String[] input){
        String code = input[0] + input[1];
        parameters = input;

        switch(code) {
            case "lioncreate":  
                return new CreateLionExecutable(zoo, parameters);
            case "liondelete":  
                return new DeleteLionExecutable(zoo);
            case "wolfcreate":  
                return new CreateWolfExecutable(zoo, parameters);
            case "wolfdelete":  
                return new DeleteWolfExecutable(zoo);
            case "snakecreate":  
                return new CreateSnakeExecutable(zoo, parameters);
            case "snakedelete":  
                return new DeleteSnakeExecutable(zoo);
        }
        return null;
    }
}
