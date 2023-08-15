package net.voiddustry.redvsblue3.game.vars;

import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.content.UnitTypes;
import mindustry.type.UnitType;
import net.voiddustry.redvsblue3.game.domain.CraftIngIngredient;

public enum UnitCrafts {
    DAGGER(UnitTypes.dagger, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    NOVA(UnitTypes.nova, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    MACE(UnitTypes.mace, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    ATRAX(UnitTypes.atrax, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    FORTRESS(UnitTypes.fortress, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    CLEROI(UnitTypes.cleroi, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    QUASAR(UnitTypes.quasar, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    SPIROCT(UnitTypes.spiroct, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),

    SCEPTER(UnitTypes.scepter, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    ARKYID(UnitTypes.arkyid, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    QUELL(UnitTypes.quell, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),

    STELL(UnitTypes.stell, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    MERUI(UnitTypes.merui, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    ELUDE(UnitTypes.elude, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    RETUSA(UnitTypes.retusa, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    LOCUS(UnitTypes.locus, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    ZENITH(UnitTypes.zenith, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    ANTHICUS(UnitTypes.anthicus, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    PRECEPT(UnitTypes.precept, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),

    POLY(UnitTypes.poly, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    GAMMA(UnitTypes.gamma, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    OBVIATE(UnitTypes.obviate, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) )),
    MEGA(UnitTypes.mega, new Seq<CraftIngIngredient>().add( new CraftIngIngredient(Items.copper, 2) ));

    public final UnitType unitType;
    public final Seq<CraftIngIngredient> ingredients;

    UnitCrafts(mindustry.type.UnitType unitType, Seq<CraftIngIngredient> craftingIngredients) {
        this.unitType = unitType;
        this.ingredients = craftingIngredients;
    }
}
