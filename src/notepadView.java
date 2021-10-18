import javax.swing.*;

public class notepadView {
    private JPanel notepadPanel;
    private JButton saveButton;
    private JButton openButton;
    private JButton clearButton;
    private JButton copyButton;
    private JTextArea textArea;

    public notepadView() {

    }
    public JPanel getPanel() {
        return notepadPanel;
    }
    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getOpenButton() {
        return openButton;
    }
    public JButton getClearButton() {
        return clearButton;
    }
    public JButton getCopyButton() {
        return copyButton;
    }
    public JTextArea getTextArea() {
        return textArea;
    }

}
