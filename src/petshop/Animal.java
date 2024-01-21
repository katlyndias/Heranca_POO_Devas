package petshop;// uma classe abstrata não pode ser instaciada (fazer o new...)
// porém serve como uma classe mãe e suas características podem ser herdadas

public abstract class Animal {
    // Atributos
    private String cor;
    private String especie;
    private int idade;

//    public petshop.Animal (String cor, String especie){
//        this.cor = cor;
//        this.especie = especie;
//
//    }

//    metodo abstrato
//    declarado mas nao implementado
//    só podemos ter esse método em classes abstratas

    public abstract void fazerBarulho();

    public String getCor(){
        return this.cor;
    }


    public void setCor(String cor){
        this.cor = cor;
    }


    public String getEspecie(){
        return this.especie;
    }


    public void setEspecie(String especie){
        this.especie = especie;
    }



}
