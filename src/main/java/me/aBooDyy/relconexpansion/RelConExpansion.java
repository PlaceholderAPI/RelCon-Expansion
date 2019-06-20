package me.aBooDyy.relconexpansion;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.Configurable;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.clip.placeholderapi.expansion.Relational;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class RelConExpansion extends PlaceholderExpansion implements Relational, Configurable {

    @Override
    public String getIdentifier() {
        return "relcon";
    }

    @Override
    public String getAuthor() {
        return "aBooDyy";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    public Map<String, Object> getDefaults() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("no_permission", "&cYou don't have permission to see this");
        return map;
    }

    public String onPlaceholderRequest(Player p1, Player p2, String identifier) {
        identifier = PlaceholderAPI.setBracketPlaceholders(p1, identifier);
        String[] args = identifier.split("_");
        String noPerm = this.getString("no_permission", "");

        if (args.length == 3) noPerm = args[2].replaceAll("\\{nl}", "\n");

        if (args.length >= 2) {
            if (p2.hasPermission(args[0])) {
                return args[1].replaceAll("\\{nl}", "\n");
            }
            return noPerm;
        }

        return null;
    }

}
