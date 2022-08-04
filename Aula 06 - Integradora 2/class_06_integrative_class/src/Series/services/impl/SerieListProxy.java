package Series.services.impl;

import Series.exceptions.SerieNotEnabledException;
import Series.services.ISerie;

import java.util.ArrayList;
import java.util.List;

public class SerieListProxy implements ISerie {
//    Attributes
    private SerieList serieList = new SerieList();
    private List<String> qtySeries = new ArrayList<>();

//    Method
    @Override
    public String getSerie(String title) throws SerieNotEnabledException {
//        The amount of views of a serie will increase every time a user watches it,
//        and its link will be returned.
//        If this amount is more than 5, an exception will take place
        if (qtySeries.size() < 5) {
            qtySeries.add(title);
            return serieList.getSerie(title);
        } else {
            throw new SerieNotEnabledException("Exceeds the amount of allowed plays");
        }
    }
}
