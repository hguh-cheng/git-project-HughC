import java.io.File;
import java.io.IOException;

public class Git{
    public static void main(String[] args) throws IOException {
        initGitRepo();
    }

    //makes a Git Repo in the current folder 
    public static void initGitRepo() throws IOException{


        File gitDir = new File("git");

        File objectsDir = new File("git/objects");

        File indexFile = new File("git/index");

        if (gitDir.exists() && objectsDir.exists() && indexFile.exists()){
            System.out.println("Git Repository already exists");
        }
        else{
            if (!gitDir.exists()){
                gitDir.mkdir();
            }
            if (!objectsDir.exists()){
                objectsDir.mkdir();
            }
            if (!indexFile.exists()){
                indexFile.createNewFile();
            }
        }
    }
    
}