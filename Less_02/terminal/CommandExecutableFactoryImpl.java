package Less_02.terminal;

import Less_02.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{

    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo){
        this.zoo = zoo;
    }

    public CommandExecutable create (Command command){

        if (command.isCreateLion()) return new CreateLionExecutable(zoo, command.getParameters());
        if (command.isCreateWolf()) return new CreateWolfExecutable(zoo, command.getParameters());
        if (command.isCreateSnake()) return new CreateSnakeExecutable(zoo, command.getParameters());
        if (command.isDeleteLion()) return new DeleteLionExecutable(zoo);
        if (command.isCreateWolf()) return new DeleteWolfExecutable(zoo);
        if (command.isDeleteSnake()) return new DeleteSnakeExecutable(zoo);
        
        return null;
    }
}
