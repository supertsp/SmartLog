// <editor-fold defaultstate="collapsed" desc="imports...">
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.*;
import smartlog.FileHandler;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author tiago, 1 de jun de 2019, 18:50:19
 */// </editor-fold>
public class Main {

    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        
        System.out.println("CurrentDateTime: " + FileHandler.getCurrentDateTime());
        
        
        
//        FolderHandler fh = new FolderHandler("testes.txt");
//        System.out.println(FolderHandler.folderExists("/xampp", "htdocs"));
//        System.out.println("[" + FolderHandler.getListOfFilesAndSubfolders("/xampp", "htdocs").length + "]" + Arrays.toString(FolderHandler.getListOfFilesAndSubfolders("/xampp", "htdocs")));
//        System.out.println("[" + FolderHandler.getListOfFiles("/teste", "minhaPasta").length + "]" + Arrays.toString(FolderHandler.getListOfFiles("/teste", "minhaPasta")));
//        System.out.println("[" + FolderHandler.getListOfFilesAndSubfolders("/teste", "minhaPasta").length + "]" + Arrays.toString(FolderHandler.getListOfFilesAndSubfolders("/teste", "minhaPasta")));
//        System.out.println(FolderHandler.createFolder("/teste", "minhaPasta"));
//        System.out.println(FolderHandler.createFolder("/teste/novo", "minhaPasta"));
//        System.out.println(FolderHandler.createFolderWithSubfolders("/teste/novo", "minhaPasta"));
//        System.out.println(FolderHandler.removeFolderAndSubContents("/teste", "minhaPasta"));
//        System.out.println(FolderHandler.removeFolderAndSubContents("/teste", ""));
//        System.out.println(FileHandler.fileExists("/teste/minhaPasta/", "arq1.txt"));
        
        //NÃO ESTÁ FUNCIONANDO
//        System.out.println(FolderHandler.renameFolder("/teste", "minhaPasta", "novaPasta"));

//        System.out.println(FolderHandler.USER_PATH);
        
//        System.out.println("\n\n\n(#01)----------------------------------------------------------------------------------------------------------[CREATE, OPEN]");
//        FileHandler arq = new FileHandler(true, "/teste/minhaPasta", "arqXXX", "txt");
//        System.out.println("Process Open: " + arq.open());
//        System.out.println(arq);
//        
//        System.out.println("\n\n\n(#02)----------------------------------------------------------------------------------------------------------[SHOW]");
//        System.out.println(arq.getLinesAsString());
////        System.out.println(arq.getLinesWhithoutBlankSpacesAsString());
//        System.out.println(arq);
//                
//        System.out.println("\n\n\n(#03)----------------------------------------------------------------------------------------------------------[SAVE]");
//        System.out.println("Process Save: " + arq.saveLinesWhithoutBlankSpaces());
//        System.out.println(arq);
//        
//        System.out.println("\n\n\n(#04)----------------------------------------------------------------------------------------------------------[ADD]");
//        System.out.println("Process Open: " + arq.open());
//        System.out.println("Process Add: " + arq.addLine("Eu sou uma nova linha adicionada no final"));        
//        System.out.println("Process Save: " + arq.save());
//        System.out.println(arq);
//        
//        System.out.println("\n\n\n(#05)----------------------------------------------------------------------------------------------------------[ADD BETWEEN]");
//        System.out.println("Process Open: " + arq.open());
//        System.out.println("Process Add Between: " + arq.addLineBetween(5, "Essa linha foi bem no meio"));        
//        System.out.println("Process Save: " + arq.save());
//        System.out.println(arq);
//        
//        System.out.println("\n\n\n(#06)----------------------------------------------------------------------------------------------------------[REMOVE]");
//        System.out.println("Process Open: " + arq.open());
//        System.out.println("Process Remove: " + arq.removeLine(5));        
//        System.out.println("Process Save: " + arq.save());
//        System.out.println(arq);
//        
//        System.out.println("\n\n\n(#07)----------------------------------------------------------------------------------------------------------[UPDATE]");
//        System.out.println("Process Open: " + arq.open());
//        System.out.println("Process Update: " + arq.updateLine(1, "Eu sou o novo \"Um\""));        
//        System.out.println("Process Save: " + arq.save());
//        System.out.println(arq);
        
        
//        LogFileHandler log = new LogFileHandler("/logs", "smartMonkey", "errorLogs", "csv");
//        log.addHeader("date", "cpu", "ram", "disk", "processes");
//        log.addLine("30", "40", "70", "chrome:10%,netbeans:50%");
//
//        
//        System.out.println("\n\n\n\n");
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    //
    //</editor-fold>
    
}//class
