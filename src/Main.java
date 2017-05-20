import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import filename_manager.FilenameManager;

public class Main {



    public static void main(String[] args) throws IOException{

        final Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("Application has started...");

        Scanner in = new Scanner(System.in);
        System.out.println("Input path directory to your files (example: D://MapImages):");
        String str = in.nextLine();
        System.out.println("Input beginIndex : ");
        int beginIndex = in.nextInt();
        System.out.println("Input endIndex: ");
        int EndIndex = in.nextInt();
        System.out.println("Input map length: ");
        int mapLength = in.nextInt();
        FilenameManager filenameManager = new FilenameManager(str,beginIndex,EndIndex,mapLength);
        Date date = new Date();
        System.out.println("Началось выполнение..." + date);
        filenameManager.doSomething();
        System.out.println("задача завершена за :" + ((int)(new Date().getTime() - date.getTime())  + "миллисекунд"));
        System.out.println("Application has successfully finished! /n Press any button");
        str = in.nextLine();
    }
}
