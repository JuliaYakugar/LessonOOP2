package Less_02.terminal;

import Less_02.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{

    private Zoo zoo;
    private String[] parameters;

    public CreateSnakeExecutable(Zoo zoo, String[] parameters) {
        this.zoo = zoo;
        this.parameters = parameters;
    }

    @Override
    public void execute() {
        this.zoo.createSnake(parameters);
        System.out.println(zoo.getLionCage());
        System.out.println(zoo.getWolfCage());   
        System.out.println(zoo.getSnakeTerrarium());      
    }  
    
}