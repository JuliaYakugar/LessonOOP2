package Less_02.terminal;

import java.util.HashMap;
import java.util.Map;

import Less_02.zoo.Zoo;

public class CommandExecutableFactory {

    private Zoo zoo;
    private String[] parameters;
    private Map<String, CommandExecutable> actions;

    public CommandExecutableFactory(Zoo zoo){
        this.zoo = zoo;
        
        actions = new HashMap<>();
    }

    public CommandExecutable create (String[] input){
        String code = input[0] + input[1];
        parameters = input;


        actions.put("liondelete", new DeleteLionExecutable(zoo));
        actions.put("lioncreate", new CreateLionExecutable(zoo, parameters));

        
        actions.put("wolfdelete", new DeleteWolfExecutable(zoo));
        actions.put("wolfcreate", new CreateWolfExecutable(zoo, parameters));

        
        actions.put("snakedelete", new DeleteSnakeExecutable(zoo));
        actions.put("snakecreate", new CreateSnakeExecutable(zoo, parameters));

        return actions.get(code);
    }
}
