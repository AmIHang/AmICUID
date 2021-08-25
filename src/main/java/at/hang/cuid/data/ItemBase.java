package at.hang.cuid.data;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class ItemBase implements Serializable {

    protected String itemType="@ItemBase";

    protected String identifier; //x
    protected String itemId; //x
    protected String displayName; //x
    protected String[] lore; //x
    protected int x, y; //x
    protected boolean keepOpen = false;

    protected String unsafeData;

    public ItemBase()
    {

    }
    public String toChestCommand() throws Exception {
        if(identifier.isBlank() || itemId.isBlank() || displayName.isBlank() || x < 0 || y < 0)
            throw new Exception("Invalid Date");

        //needed data
        String out = identifier+" {\n";
        out += "    ID=\""+itemId+"\",\n";
        out += "NAME=\""+displayName+"\"\n";
        out += "    LORE=[\n";
        for(int i = 0; i < lore.length; i++)
            out+="      \""+lore[i]+"\",\n";
        out += "]\n";
        out += "POSITION-X="+x+"\n";
        out += "POSITION-Y="+y+"\n";
        out += "KEEP-OPEN="+(keepOpen ? "true" : "false")+"\n";

        //optional data
        if(!unsafeData.isBlank())
            out += "UNSAFE-DATA=\""+unsafeData+"\"\n";

        return out+"}\n";
    }


    public String toString()
    {
        return identifier;
    }
}
