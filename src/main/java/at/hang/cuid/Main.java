package at.hang.cuid;

import at.hang.cuid.dlg._PokemonDlg;
import at.hang.cuid.ui.ChestUI;
import at.hang.cuid.ui.StartUI;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StartUI start = new StartUI();
        start.setVisible(true);
        ChestUI ui =new ChestUI(6);

        Thread.sleep(2500);
        _PokemonDlg dlg = new _PokemonDlg(0,0);
        //dlg.setVisible(true);
        start.setVisible(false);
        ui.setVisible(true);
        //System.out.println(AmIUtils.toFancyString("dasdad-sAsadasda"));
    }
}
