package poo_model;

public class Endereco {

    public enum TipoEndereco{
        RESIDENCIAL,
        ENTREGA,
        TRABALHO}

    private String endereco;
    private String numero;
    private String complemente;
    private String cidade;
    private String bairro;
    private String estado;
    public String cep;
    private TipoEndereco tipo;

}
