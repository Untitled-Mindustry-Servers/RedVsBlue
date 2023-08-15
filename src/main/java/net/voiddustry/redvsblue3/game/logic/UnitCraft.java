package net.voiddustry.redvsblue3.game.logic;

import arc.util.Timer;
import mindustry.gen.Call;
import mindustry.gen.Player;
import mindustry.ui.Menus;
import net.voiddustry.redvsblue3.game.domain.UnitCraftList;
import net.voiddustry.redvsblue3.game.domain.UnitCraftTicket;
import net.voiddustry.redvsblue3.player.Bundle;
import net.voiddustry.redvsblue3.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnitCraft {
    private static Map<String, UnitCraftTicket> craftTicketMap = new HashMap<>();

    public static void openMenu(Player player, int category) {
        String[][] unitsInRow = null;

        int menu = Menus.registerMenu((player1, option) -> {
            if (option < 4) {
                switch (option) {
                    case 0 -> openMenu(player, 1);
                    case 1 -> openMenu(player, 2);
                    case 2 -> openMenu(player, 3);
                    case 3 -> openMenu(player, 4);
                }
            }
        });

        String[] categories = {
                "[royal]S",
                "[purple]R",
                "[lime]L",
                "[gold]P"
        };

        switch (category) {
            case 1 -> { // standardUnits
                ArrayList<String[]> units = new ArrayList<>();

                units.add(categories);

                UnitCraftList.standardUnits.forEach(object -> {
                    String unitNameBundled = "[royal]" + Bundle.get("units." + object.key, player.locale);
                    units.add(new String[]{unitNameBundled});
                });

                unitsInRow = units.toArray(String[][]::new);
            }
            case 2 -> { // researchUnits // [#B00BA5]
                ArrayList<String[]> units = new ArrayList<>();

                units.add(categories);

                UnitCraftList.researchUnits.forEach(object -> {
                    String unitNameBundled = "[royal]" + Bundle.get("units." + object.key, player.locale);
                    units.add(new String[]{unitNameBundled});
                });

                unitsInRow = units.toArray(String[][]::new);
            }
            case 3 -> { // limitedUnits 
                ArrayList<String[]> units = new ArrayList<>();

                units.add(categories);

                UnitCraftList.limitedUnits.forEach(object -> {
                    String unitNameBundled = "[royal]" + Bundle.get("units." + object.key, player.locale);
                    units.add(new String[]{unitNameBundled});
                });

                unitsInRow = units.toArray(String[][]::new);
            }
            case 4 -> { // premiumUnits
                ArrayList<String[]> units = new ArrayList<>();

                units.add(categories);

                UnitCraftList.premiumUnits.forEach(object -> {
                    String unitNameBundled = "[royal]" + Bundle.get("units." + object.key, player.locale);
                    units.add(new String[]{unitNameBundled});
                });

                unitsInRow = units.toArray(String[][]::new);
            }
        }

        Call.menu(player.con, menu, "todo", "todo", unitsInRow);
    }

    private static void renderTickets() {
        craftTicketMap.forEach((uuid, ticket) -> {
             if (Utils.timer >= ticket.createTime() + ticket.createDuration()) {

             }
        });
    }

    public static void initTimer() {
        Timer.schedule(UnitCraft::renderTickets, 0, 1);
    }
}
