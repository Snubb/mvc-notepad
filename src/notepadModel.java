import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class notepadModel {
    public notepadModel() {

    }

    public String copy(String text) {

        return text + "\n" + text;
    }

    public String open() {
        // Öppna fil för läsning
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        String filename;
        if (result == JFileChooser.APPROVE_OPTION) {
            filename = fc.getSelectedFile().getAbsolutePath();
        } else {
            filename = "exempel.txt";
        }

        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException a) {
            a.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        // Läs in filen
        String line = "";
        try {
            while ((inFile.readLine()) != null) {
                System.out.println(inFile.readLine());
                line = line + inFile.readLine() + "\n";
            }
            inFile.close();
        } catch (IOException a) {
            a.printStackTrace();
        }
        return line;
    }
}
