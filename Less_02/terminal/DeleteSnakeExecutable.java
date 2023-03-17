package Less_02.terminal;

import Less_02.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable{
    
    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.deleteSnake();
        System.out.println(zoo.getLionCage());
        System.out.println(zoo.getWolfCage());   
        System.out.println(zoo.getSnakeTerrarium());     
    }
}