package net.voiddustry.redvsblue3.game.domain;

import arc.struct.ObjectMap;
import net.voiddustry.redvsblue3.game.vars.UnitCrafts;

public class UnitCraftList {
    public final static ObjectMap<String, UnitCrafts> standardUnits = ObjectMap.of(
            "dagger", UnitCrafts.DAGGER,
            "nova", UnitCrafts.NOVA,
            "mace", UnitCrafts.MACE,
            "atrax", UnitCrafts.ATRAX,
            "fortress", UnitCrafts.FORTRESS,
            "cleroi", UnitCrafts.CLEROI,
            "quasar", UnitCrafts.QUASAR,
            "spiroct", UnitCrafts.SPIROCT
    );
    public final static ObjectMap<String, UnitCrafts> limitedUnits = ObjectMap.of(
            "scepter", UnitCrafts.SCEPTER,
            "arkyid", UnitCrafts.ARKYID,
            "quell", UnitCrafts.QUELL
    );
    public final static ObjectMap<String, UnitCrafts> researchUnits = ObjectMap.of(
            "stell", UnitCrafts.STELL,
            "merui", UnitCrafts.MERUI,
            "elude", UnitCrafts.ELUDE,
            "retusa", UnitCrafts.RETUSA,
            "locus", UnitCrafts.LOCUS,
            "zenith", UnitCrafts.ZENITH,
            "anthicus", UnitCrafts.ANTHICUS,
            "precept", UnitCrafts.PRECEPT
    );
    public final static ObjectMap<String, UnitCrafts> premiumUnits = ObjectMap.of(
            "poly", UnitCrafts.POLY,
            "gamma", UnitCrafts.GAMMA,
            "obviate", UnitCrafts.OBVIATE,
            "mega", UnitCrafts.MEGA
    );
}
