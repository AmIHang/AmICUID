package at.hang.cuid;

import at.hang.cuid.bl.CUIDBl;
import at.hang.cuid.dlg._PokemonDlg;
import at.hang.cuid.ui.ChestUI;
import at.hang.cuid.ui.StartUI;

import java.io.File;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StartUI start = new StartUI();
        start.setVisible(true);
        start.setAutoRequestFocus(true);
        ChestUI ui =new ChestUI(6);

        Thread.sleep(2500);
        _PokemonDlg dlg = new _PokemonDlg(0,0);
        //dlg.setVisible(true);
        start.setVisible(false);
        loadFile();
        //ui.setVisible(true);
        //System.out.println(AmIUtils.toFancyString("dasdad-sAsadasda"));
    }

    private static void loadFile()
    {
        File f = new File(System.getProperty("user.home")+"\\AppData\\Roaming\\.ami\\cii\\Unnamed (2).json");
        ChestUI ui = new ChestUI(CUIDBl.getInstance().loadChestInventory("Unnamed (4).json"));
        ui.setVisible(true);
    }


}


