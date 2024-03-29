package at.hang.cuid.bl;

import at.hang.cuid.data.BaseItem;
import at.hang.cuid.data.Pokemon;
import at.hang.cuid.util.AmIUtils;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

public class ChestBl
{

    private static File path = new File(System.getProperty("user.home")+"\\AppData\\Roaming\\.ami\\cii");
    @Getter @Setter
    private String filename = null;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private BaseItem items[][];

    public ChestBl()
    {

    }

    public ChestBl(String name, int rowCount)
    {
        this.name = name;
        items = new BaseItem[rowCount][9];
    }

    public BaseItem getItemAt(int row, int col)
    {
        return items[row][col];
    }
    public void setItemAt(int row, int col, Pokemon pkm)
    {
        items[row][col] = pkm;
    }




}
