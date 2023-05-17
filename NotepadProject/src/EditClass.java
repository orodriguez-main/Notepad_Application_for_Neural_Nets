import java.util.Date;
public class EditClass {
    NotepadClass notepadClass;
    Date date = new Date();
    //Constructor:
    public EditClass(NotepadClass notepadClass){
        this.notepadClass = notepadClass;
    }

    public void copyText(){
        notepadClass.TextArea.copy();
    }

    public void pasteText(){
        notepadClass.TextArea.paste();
    }

    public void undoText(){
        notepadClass.undoManager.undo();
    }

    public void redoText(){
        notepadClass.undoManager.redo();
    }

    public void selectAllText(){
        notepadClass.TextArea.selectAll();
    }

    public void deleteText(){
        notepadClass.TextArea.replaceSelection("");
    }

    public void printDate(){
        notepadClass.TextArea.setText(String.valueOf(date));
    }
}
