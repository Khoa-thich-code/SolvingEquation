
package View;
import Controller.Caculate;
import java.util.ArrayList;
import model.Validate;
public class Menu {
    static final Caculate CAL = new Caculate();
    static final model.Validate CHECK = new Validate();
    static final ArrayList<Float> LIST_FLOAT = new ArrayList<>();

   public void equationProgramMenu() {
        System.out.println("==========Equation Program========\n"
                + "1. Caculate Superlative Equation\n"
                + "2. Caculate Quadratic Equation\n"
                + "3. Exit.\n");
        
        int choose;
        
        do {
            choose = CHECK.getInt("Please choice one option: ", 1, 3);
            switch(choose) {
                case 1:
                    CAL.outputEquation(LIST_FLOAT);
                    LIST_FLOAT.clear();
                    break;
                case 2:
                    CAL.outputQuadratic(LIST_FLOAT);
                    LIST_FLOAT.clear();
                    break;
                case 3:
                    return;
            }
        } while(choose != 3);
        
    }

}