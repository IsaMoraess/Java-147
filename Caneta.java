public class Caneta{
    //ATRIBUTOS
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    //STATUS DO OBJ
    void status(){
    //this auto referencia = quem chamou o metodo status vai ser substituido por this
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tempada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga " + this.carga);
    }

    //METODOS
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta Tampada. Não posso rabiscar!");
        }
        else{
            System.out.println("Caneta Destampada. Estou rabiscando!");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}