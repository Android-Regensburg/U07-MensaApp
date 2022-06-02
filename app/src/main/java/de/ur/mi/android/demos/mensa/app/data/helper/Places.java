package de.ur.mi.android.demos.mensa.app.data.helper;

import de.ur.mi.android.demos.mensa.app.R;

/**
 * Diese Enum repräsentiert die verfügbaren Mensen.
 * Über die fromLongName-Methode kann eine Instanz zurückgegeben werden, die einem Namen einer
 * Hochschule entspricht.
 * Die fromItemId Methode erlaubt die Rückgabe eines Orts, der mit einem Element des Drawer Menüs
 * korrespondiert.
 * Die Places Objekte haben die code Eigenschaft, diese muss in die URL der API eingefügt werden,
 * um Daten der entsprechenden Mensa zu erhalten.
 */
public enum Places {

    UNI_REGENSBURG("uni"),
    OTH_REGENSBURG("oth");

    public final String code;

    Places(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Places fromLongName(String name) {
        if(name.equals("Uni Regensburg")) {
            return Places.UNI_REGENSBURG;
        } else if (name.equals("OTH Regensburg")) {
            return Places.OTH_REGENSBURG;
        }

        return Places.UNI_REGENSBURG;
    }

    public static Places fromItemId(int id) {
        if (id == R.id.regensburg_menu) {
            return Places.UNI_REGENSBURG;
        } else if (id == R.id.oth_menu) {
            return Places.OTH_REGENSBURG;
        }

        return Places.UNI_REGENSBURG;
    }

}