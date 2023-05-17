import java.awt.*;

public class FormatClass {
    NotepadClass notepadClass;
    Font arial, comicSansMS, timesNewRoman;
    String selectedFont;

    public FormatClass(NotepadClass NotepadClass){
        this.notepadClass = NotepadClass;
    }

    public void setWordWrap(){
        if (notepadClass.WordWrapOn == false){
            notepadClass.WordWrapOn = true;
            notepadClass.TextArea.setLineWrap(true);
            notepadClass.TextArea.setWrapStyleWord(true);
            notepadClass.Wrap.setText("Word Wrap: ON");
        }
        else if (notepadClass.WordWrapOn == true){
            notepadClass.WordWrapOn = false;
            notepadClass.TextArea.setLineWrap(false);
            notepadClass.TextArea.setWrapStyleWord(false);
            notepadClass.Wrap.setText("Word Wrap: OFF");
        }
    }

    public void setFontType(int fontSize){
        arial = new Font("Arial", Font.PLAIN, fontSize);
        comicSansMS = new Font("comic Sans MS", Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman", Font.PLAIN, fontSize);
        setFontType(selectedFont);
    }

    public void setFontType(String font){
        selectedFont = font;
        switch (selectedFont){
            case "Arial": notepadClass.TextArea.setFont(arial);break;
            case "Comic Sans MS": notepadClass.TextArea.setFont(comicSansMS);break;
            case "Times New Roman": notepadClass.TextArea.setFont(timesNewRoman); break;
        }
    }
}
