package service;

import dao.IDao;
import model.Endereco;
import model.Filme;

public class FilmeService {

    private IDao<Filme> filmeIDao;

    public FilmeService(IDao<Filme> filmeIDao) {
        this.filmeIDao = filmeIDao;
    }

    public Filme salvar(Filme filme) {
        filmeIDao.salvar(filme);
        return filme;
    }
}
