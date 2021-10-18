import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
                view.setText("");
            }
        });

        view.getCopyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setText(model.copy(view.getTextArea().getText()));
            }
        });

        view.getOpenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setText("");

                String newText = model.open();

                view.setText(newText);
            }
        });

    }
    public static void main(String[] args) {
        notepadController controller = new notepadController();
    }

}
