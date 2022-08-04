package Series.services.impl;

import Series.services.ISerie;

public class SerieList implements ISerie {
    @Override
    public String getSerie(String title) {
//        Remove spaces from serie's name
        return "www."+title.replace(" ", "").toLowerCase()+".com";
    }
}
