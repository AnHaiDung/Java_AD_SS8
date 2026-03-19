import java.util.Scanner;

public class Adapter {
}

class YoungHuman{
    void move2foot(){
        System.out.println("Dang di bang 2 chan");
    }
}

interface OldHuman{
    void move3foot();
}

class HumanAdapter implements OldHuman{
    private YoungHuman old;
    public HumanAdapter(YoungHuman old){
        this.old = old;
    }

    @Override
    public void move3foot() {
        old.move2foot();
        System.out.println("chuyen sang di bang gay");
    }
}