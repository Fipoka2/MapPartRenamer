package filename_manager;

import java.io.File;

/**
 * Created by Dmitry on 19.05.2017.
 */
public class FilenameManager {

    private RenamingAlgorithm algorithm;

    private File pathDirectory;

    public void doSomething()
    {
        String[] files = pathDirectory.list();
        int good=0,bad=0;
        for (String oldFileName:files)
        {

            File mapPart = new File(pathDirectory  + "/"+ oldFileName);
            File newfile = new File(pathDirectory + "/" + algorithm.getNewName(oldFileName));
            if(mapPart.renameTo(newfile))
            {
                good++;
                System.out.println("File {" + oldFileName + "} was renamed to " + newfile.getName());
            }
            else {
                bad++;
                System.err.println("Error! Unable to rename file {" + oldFileName + "}");
            }


        }
        System.out.println((good-bad) + "/" + (good+bad)+ "files were renamed.");
    }

    public FilenameManager(String pathDir,int beginIndex, int EndIndex,int mapLength) {
        this.algorithm = new RenamingAlgorithm(beginIndex,EndIndex,mapLength);
        pathDirectory = new File(pathDir);
    }
}
