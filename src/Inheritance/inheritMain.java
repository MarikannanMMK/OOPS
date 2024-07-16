package Inheritance;

public class inheritMain {
    public static void main(String[] args) {

        Samsung sam , sam1 ;

        sam1 = new Samsung();

        Mobile mob = new Samsung(); // both child const and Parent cont;

        mob.display();

        //Samsung sam3 = new Mobile(); // parent constructor;

        sam = new Samsung("A1035");

        sam.Battery();
        sam.display();

        sam.setModel("A123");
        sam1.setModel("M123");

          Samsung.Battery();

          Samsung.model="MinionMMK";

         // vivo v= new vivo();

            vivo.mac.keyboard = "New";


    }
}
