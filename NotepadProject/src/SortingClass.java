import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class SortingClass {
    NotepadClass notepadClass;
    String DirectoryPath = "C:\\Users\\osprs\\OneDrive\\Desktop\\CS 3500 Folder";

    public SortingClass(NotepadClass NotepadClass){
        this.notepadClass = NotepadClass;
    }

    public void sortByName() {
        File dir = new File(DirectoryPath);

        File[] files = dir.listFiles();

        Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

        for (File file : files) {
            if (!file.isHidden()) {
                if (file.isDirectory()) {
                    System.out.println("DIR \t" + file.getName());
                } else {
                    System.out.println("FILE\t" + file.getName());
                }
            }
        }
    }

    public void sortByDate() {
        File dir = new File(DirectoryPath);

        File[] files = dir.listFiles();

        Arrays.sort(files, (f1, f2) -> {
            return new Date(f1.lastModified()).compareTo(new Date(f2.lastModified()));
        });

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        for (File file : files) {
            if (!file.isHidden()) {
                if (file.isDirectory()) {
                    System.out.println("DIR \t" + " "
                            + df.format(new Date(file.lastModified())) + "\t" + file.getName());
                } else {
                    System.out.println("FILE\t" + " "
                            + df.format(new Date(file.lastModified())) + "\t" + file.getName());
                }
            }
        }
    }

    public void sortBySize(){
        File dir = new File(DirectoryPath);

        File[] files = dir.listFiles();

        Arrays.sort(files, (f1, f2) -> {
            return new Long(f1.length()).compareTo(new Long(f2.length()));
        });

        for (File file : files) {
            if (!file.isHidden()) {
                if (!file.isDirectory()) {
                    System.out.println("FILE\t" + " " + file.length() + " bytes\t\t" + file.getName());
                }
            }
        }
    }
}
