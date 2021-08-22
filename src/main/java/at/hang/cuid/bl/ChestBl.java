package at.hang.cuid.bl;

import at.hang.cuid.data.Item;
import at.hang.cuid.data.ItemBase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

public class ChestBl
{

    private static File path = new File(System.getProperty("user.home")+"\\AppData\\Roaming\\.ami\\cii");
    @Getter
    private ItemBase items[][];
    @Getter @Setter
    private String name = "";

    static
    {
        new File(path.getPath().substring(0, path.getPath().length()-4)).mkdir();
        path.mkdir();
        new File(path.getPath()+"\\export").mkdir();
    }
    public ChestBl(String name, int rowCount)
    {


        this.name = name;
        items = new ItemBase[rowCount][9];
    }

    public ItemBase getItemAt(int row, int col)
    {
        return items[row][col];
    }

    public void setItem(ItemBase item, int row, int col)
    {
        this.items[row][col] = item;
    }

    public void save()  {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(new File(path.getPath()+"\\" + genFileName())));
            br.write(gson.toJson(items));
            br.flush();
            br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Smth went wrong while saving");
        }
    }

    public void load(String filename)
    {
        Gson gson = new Gson();
        if(!filename.substring(filename.length()-5).equals(".json"))
            filename += ".json";

        try(BufferedReader br = new BufferedReader(new FileReader(new File(path+"\\"+filename))))
        {
            items = gson.fromJson(br, Item[][].class);
            name = filename.substring(0, filename.length()-5);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private String genFileName()
    {
        String filename = name+".json";

        boolean uniqueNameFound = false;
        int c = 1;
        while(!uniqueNameFound)
        {

            uniqueNameFound = true;

            if(c != 1)
            {
                filename = name+" ("+c+").json";
            }

            for(File f : path.listFiles())
                if(f.getName().equals(filename))
                    uniqueNameFound = false;
            c++;
        }

        return filename;
    }
}
