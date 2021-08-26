package at.hang.cuid.util;

import at.hang.cuid.data.BaseItem;
import at.hang.cuid.data.Pokemon;

import java.util.Locale;

public class AmIUtils
{

    public static String toFancyString(String str)
    {
        String out = "";
        String[] parts = str.split("-");

        for(int i = 0; i < parts.length; i++)
            out += (i != 0 ? "-" :"") + parts[i].substring(0,1).toUpperCase(Locale.ROOT) + parts[i].substring(1).toLowerCase(Locale.ROOT);

        return out;
    }




}
