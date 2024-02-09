import java.util.*;

public class Example1 {

    public static Dialog dialog;
    public interface Button {
        void render();
    }

    class WindowsButton implements Button {
        public void render() {
            System.out.println("Rendering Windows Button");
        }
    }

    class HTMLButton implements Button {
        public void render() {
            System.out.println("Rendering HTML Button");
        }
    }

    abstract class Dialog {
        abstract Button createButton();
        void render() {
            Button okButton = createButton();
            okButton.render();
        }
    }

    class WindowDialog extends Dialog {
        Button createButton() {
            return new WindowsButton();
        }
    }

    class WebDialog extends Dialog {
        Button createButton () {
            return new HTMLButton();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String system = scanner.nextLine();
        if(system == "W") {
            dialog = new WindowDialog();
        } else if(system == "H") {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error!");
        }
    }
}