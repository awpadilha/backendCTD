package dao;

public interface IDao <T> {

// ir primeiro na interface recebe generics e recebe metodos

    public  T salvar (T t);


}
