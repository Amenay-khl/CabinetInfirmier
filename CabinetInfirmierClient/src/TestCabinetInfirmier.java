
import fr.ujf_grenoble.l3miage.medical.Exception_Exception;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yanis
 */
public class TestCabinetInfirmier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception_Exception, IOException {
        Scanner scanner = new Scanner(System.in);
        String id_str;
        int id_int;
        
        System.out.println("------ Test getNomCabinet ------");
        System.out.println("Nom du cabinet : " + getNomCabinet());
        System.out.println("--------------------------------");
        System.out.println("");
        
        System.out.println("------ Test getInfirmiere ------");
        System.out.print("Veuillez saisir un numéro d'infirmiére (001 ou 002 ou 003) : ");
        id_str = scanner.nextLine();
        xml.FileUtil.stringToFile(getInfirmiere(id_str), "src/cache/myHtmlFile.html");
        xml.BrowserUtil.launch("src/cache/myHtmlFile.html");
        System.out.println("--------------------------------");
        
        
        
        
        /*xml.FileUtil.stringToFile(getHTML(),"src/cache/myHtmlFile.html");
         xml.BrowserUtil.launch("src/cache/myHtmlFile.html");*/
    }

    private static String getNomCabinet() throws Exception_Exception {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getNomCabinet();
    }

    private static String getHTML() throws Exception_Exception {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getHTML();
    }

    private static String getInfirmiere(java.lang.String infirmierId) throws Exception_Exception {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getInfirmiere(infirmierId);
    }    
    
}