import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class notepadController {
    private notepadModel model;
    private notepadView view;

    public notepadController(){
        model = new notepadModel();
        view = new notepadView();


        JFrame frame = new JFrame("notepadView");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        view.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTextArea().setText("");
            }
        });

        view.getCopyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTextArea().append("\n" + view.getTextArea().getText());
                System.out.println(view.getTextArea().getText());
            }
        });

    }
    public static void main(String[] args) {
        notepadController controller = new notepadController();
    }

}
