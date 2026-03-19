import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Observer {
    public static void main(String[] args) {
        ReceiverObserver r1 = new ConcreteReceiver("Nguyễn Huy Hoàn");
        ReceiverObserver r2 = new ConcreteReceiver("Hoan Lon Lon");

        SourceNews vnEx = new SourceNews();
        vnEx.addReceiver(r1);
        vnEx.addReceiver(r2);
        vnEx.sendNews();
    }
}

//nguoi nhan la ai
interface ReceiverObserver{
    void update(String news);
}

//Nguồn tin tưc
class SourceNews{
    private List<ReceiverObserver> observers = new ArrayList<>();
    public void addReceiver(ReceiverObserver receiver){
        observers.add(receiver);
    }

    public void sendNews(){
        String content = "Hoan loan khong chu y";
        observers.forEach(ob->{
            ob.update(content);
        });
    }
}

// Nguoi nhan cho tiet
class ConcreteReceiver implements ReceiverObserver{
    private String name;
    public ConcreteReceiver(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Ban "+ name+"da nhan duoc tin: "+news);
    }
}