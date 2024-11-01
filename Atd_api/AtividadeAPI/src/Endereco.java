import com.google.gson.annotations.SerializedName;

public class Endereco {
    String cep;
    @SerializedName("logradouro") String rua;
    String bairro;
    String complemento;
    @SerializedName("localidade") String cidade;
    String uf;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "CEP: " +cep+"\n"+
                "RUA: " +rua+"\n"+
                "BAIRRO: "+bairro+"\n"+
                "COMPLEMENTO: " +complemento+"\n"+
                "CIDADE: " +cidade+"\n"+
                "ESTADO-: " +uf;
    }
}
