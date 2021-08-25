package at.hang.cuid.bl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.*;

public class CUIDBl {
    private static CUIDBl instance = null;

    private String path = System.getProperty("user.home")+"\\AppData\\Roaming\\.ami\\cuid";
    private BufferedWriter bw;
    private BufferedReader br;

    private CUIDBl()
    {
        new File(path.substring(0,  path.length()-5)).mkdir();
        new File(path).mkdir();
    }

    public boolean saveChestInventory(ChestBl chest)
    {
        try
        {
            File out = new File(path+"\\"+ (chest.getFilename() != null
                    ? chest.getFilename()
                    : genUniqueFilename(chest.getFilename() != null
                    ? chest.getFilename()
                    : chest.getName())));

            bw = new BufferedWriter(new FileWriter(out));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            bw.write(gson.toJson(chest));
            bw.flush();
            bw.close();

            chest.setFilename(out.getName());
            return true;
        }
        catch(IOException io)
        {
            io.printStackTrace();
            return false;
        }
    }

    public ChestBl loadChestInventory(String filename)
    {
        Gson gson = new Gson();
        filename += filename.endsWith(".json") ? "" : ".json";

        try
        {
            br = new BufferedReader(new FileReader(new File(path+"\\"+filename)));
            ChestBl chestBl = gson.fromJson(br, ChestBl.class);
            chestBl.validateItems();
            return chestBl;
        }
        catch(FileNotFoundException nfe)
        {
            return null;
        }
    }

    private String genUniqueFilename(String filename)
    {
        if(filename.endsWith(".json"))
            filename.substring(0, filename.length()-5);

        boolean unique = false;
        int count = 1;

        String uniqueName = filename;
        while(!unique)
        {
            unique = true;
            if(count != 1)
                uniqueName = filename + " (" + count + ").json";
            else
                uniqueName += ".json";

            for(File f : new File(path).listFiles())
                if(f.getName().equals(uniqueName))
                {
                    unique = false;
                    break;
                }

            count++;
        }

        return uniqueName;
    }

    public static CUIDBl getInstance()
    {
        if(instance == null)
            instance = new CUIDBl();

        return instance;
    }
}
