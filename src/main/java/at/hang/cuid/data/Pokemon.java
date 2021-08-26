package at.hang.cuid.data;

import at.hang.cuid.util.AmIUtils;
import lombok.Data;

import java.util.Locale;

@Data
public class Pokemon extends BaseItem {


    {
        itemType = "@Pokemon";
    }

    public Pokemon(BaseItem item)
    {
        this.setIdentifier(item.getIdentifier());
        this.setItemId(item.getItemId());
        this.x = item.getX();
        this.y = item.getY();
        this.setUnsafeData(unsafeData);
    }

    public Pokemon(PokemonEnum pkm, int x, int y)
    {
        this.setIdentifier(pkm.getName().toLowerCase(Locale.ROOT));
        this.setItemId("pixelmon:pixelmon_sprite");
        this.setDisplayName(AmIUtils.toFancyString(pkm.getName()));
        this.x = x;
        this.y = y;
        this.unsafeData = "SpriteName, pixelmon:sprites/pokemon/"+pkm.getId();
    }

    public Pokemon(PokemonEnum pkm, int x, int y, boolean german)
    {
        this.setIdentifier(pkm.getName().toLowerCase(Locale.ROOT));
        this.setItemId("pixelmon:pixelmon_sprite");
        this.setDisplayName(AmIUtils.toFancyString(german ? pkm.getNameDe() : pkm.getName()));
        this.x = x;
        this.y = y;
        this.unsafeData = "SpriteName, pixelmon:sprites/pokemon/"+pkm.getId();
    }

    public void setForm(String form)
    {
        this.unsafeData +="-"+form;
    }

    public String toString()
    {
        return "+";
    }

}
