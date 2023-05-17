import java.awt.*;
import java.io.*;

public class FileClass {

    NotepadClass notepadClass;//import notepadClass class and name it notepadClass
    String FileName;
    String FileAddress;

    //Constructor:
    public FileClass(NotepadClass NotepadClass){
        this.notepadClass = NotepadClass;//we can access the notepadClass class
    }

    public void createNewFile(){
        notepadClass.TextArea.setText("");
        notepadClass.MainFrame.setTitle("New");
        FileName = null;
        FileAddress = null;
    }

    public void openFile(){
        FileDialog fileDialog = new FileDialog(notepadClass.MainFrame, "Open", FileDialog.LOAD);//access fileClass dialog
        fileDialog.setVisible(true);// make it appear

        if (fileDialog.getFile()!= null){
            FileName = fileDialog.getFile();
            FileAddress = fileDialog.getDirectory();
            notepadClass.MainFrame.setTitle(FileName);
        }
        System.out.println("File address and fileClass name: " + FileAddress + FileName);

        try{
            BufferedReader br = new BufferedReader(new FileReader(FileAddress + FileName));//you need address to read a fileClass
            notepadClass.TextArea.setText("");

            String line = null;

            while ((line = br.readLine())!= null){
                notepadClass.TextArea.append(line + "\n");
            }
            br.close();

        } catch(Exception e) {
            System.out.println("FILE NOT OPENED");// if you didn't openFile files, it will go through this exception
        }
    }

    public void saveFile(){
        if (FileName == null){
            saveAs();
        }
        else {
            try{
                FileWriter fw = new FileWriter(FileAddress + FileName);
                fw.write(notepadClass.TextArea.getText());
                notepadClass.MainFrame.setTitle(FileName);
                fw.close();

            }catch(Exception e){
                System.out.println("SOMETHING WENT WRONG");
            }
        }
    }

    public void saveAs(){
        FileDialog fd = new FileDialog(notepadClass.MainFrame, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile()!= null){
            FileName = fd.getFile();
            FileAddress = fd.getDirectory();
            notepadClass.MainFrame.setTitle(FileName);
        }

        try{
            FileWriter fw = new FileWriter(FileAddress + FileName);
            fw.write(notepadClass.TextArea.getText());
            fw.close();

        }catch (Exception e){
            System.out.println("SOMETHING WENT WRONG.");
        }
    }
}

