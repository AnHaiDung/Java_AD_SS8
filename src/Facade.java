import java.util.Scanner;

public class Facade {
    public static void main(String[] args) {
        FacadeResstaurant facadeResstaurant = new FacadeResstaurant();
        facadeResstaurant.order();
        facadeResstaurant.pay();
    }

}

class FacadeResstaurant{
    private Chef chef = new Chef();
    private Staff staff = new Staff();
    private Manager manager = new Manager();
    void order(){
        staff.order();
        chef.cook();
    }
    void pay(){
        staff.invoice();
        manager.feedback();
        manager.complainToChef();
    }
}

class Chef{
    public void cook(){
        System.out.println("Nhan order tu boi ban");
        System.out.println("nau mon an");
    }
}

class Staff{
    public void order(){
        System.out.println("Order mon an cho khach");
    }
    public void invoice(){
        System.out.println("Gui hoa don cho khach");
    }
}

class Manager{
    public void feedback(){
        System.out.println("hoi y kien khach ve trai nghiem mon an");
    }

    public void complainToChef(){
        System.out.println("Chui dau bep");
    }
}
