import java.awt.*;

public class ColorClass {
    NotepadClass notepadClass;
    //Constructor
    public ColorClass(NotepadClass notepadClass){
        this.notepadClass = notepadClass;
    }
    //This method changes the color of the background text area:
    public void changeBackgroundColor(String color){
        switch(color){
            case "White":
                notepadClass.MainFrame.getContentPane().setBackground(Color.WHITE);
                notepadClass.TextArea.setBackground(Color.WHITE);
                notepadClass.TextArea.setForeground(Color.BLACK);
                break;

            case "Black":
                notepadClass.MainFrame.getContentPane().setBackground(Color.BLACK);
                notepadClass.TextArea.setBackground(Color.BLACK);
                notepadClass.TextArea.setForeground(Color.WHITE);
                break;

            case "Blue":
                notepadClass.MainFrame.getContentPane().setBackground(Color.BLUE);
                notepadClass.TextArea.setBackground(Color.BLUE);
                notepadClass.TextArea.setForeground(Color.WHITE);
                break;
            case "Pink":
                notepadClass.MainFrame.getContentPane().setBackground(Color.PINK);
                notepadClass.TextArea.setBackground(Color.PINK);
                notepadClass.TextArea.setForeground(Color.white);
                break;
        }
    }
}
