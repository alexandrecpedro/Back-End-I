package HotelGroup.filial.service;

import HotelGroup.filial.dao.IDao;
import HotelGroup.filial.model.Filial;

import java.util.List;

public class FilialService {
    /** Attribute **/
    private IDao<Filial> filialIDao;

    /** Constructor **/
    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    /** Method **/
    public Filial salvar(Filial filial) {
        return filialIDao.salvar(filial);
    }

    public List<Filial> listar() {
        return filialIDao.listar();
    }
}
