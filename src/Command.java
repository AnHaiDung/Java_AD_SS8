import java.util.Scanner;

public class Command {
    public static void main(String[] args) {
        Light light = new Light();
        LightCommand on = new TurnOnLight(light);
        LightCommand off = new TurnOffLight(light);

        RemoteLight remoteLight = new RemoteLight();
        remoteLight.setLightCommand(on);
        remoteLight.pressPowerButton();
        remoteLight.pressUndoButton();
    }

}

class Light {
    public void turnOn(){
        System.out.println("den da bat: Bling Bling");
    }

    public void turnOf(){
        System.out.println("den da tat");
    }
}

//lenh
interface LightCommand{
    void execute(); // thuc thi
    void undo(); // hoan tac
}

class TurnOnLight implements LightCommand{
    private Light light;
    public TurnOnLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOf();
    }
}

class TurnOffLight implements LightCommand{
    private Light light;
    public TurnOffLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOf();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

class RemoteLight{
    private LightCommand lightCommand;
    public void setLightCommand(LightCommand lightCommand){
        this.lightCommand = lightCommand;
    }

    public void pressPowerButton(){
        lightCommand.execute();
    }

    public void pressUndoButton(){
        lightCommand.undo();
    }
}
