package servises;

import view.Creditline;

public class Main {
    public static void main(String[] args) {
          new Creditline();
         /*Model model = new Model();
        System.out.println(model.getPurchase());*/
         Controller controller = new Controller();
        System.out.println("Ваши условия выполняются только в банке " + controller.goodadvise());
    }
}
