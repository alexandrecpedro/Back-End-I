package Series.services;

import Series.exceptions.SerieNotEnabledException;

public interface ISerie {
    String getSerie(String name) throws SerieNotEnabledException;
}
