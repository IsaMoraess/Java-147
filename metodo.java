public class metodo {
    public static void main(String args[]) {
        // INSTANCIAR OBJETO
        Caneta c1 = new Caneta();
        // CHAMADA DE ATIBUTO
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 85;
        c1.ponta = 0.5;

        // CHAMADA DE METODO
        c1.tampar();// se tiver ativo o cod= 'Caneta Tampada. Não posso rabiscar!'
        // c1.destampar();//se tiver ativo o cod= 'Caneta Destampada. Estou rabiscando!'
        c1.status();
        c1.rabiscar();
        System.out.println("----------------------------------------------");

                                // CRIANDO OUTRA INSTANCIA
        // CHAMADA DE ATIBUTO
        Caneta c2 = new Caneta();
        c2.modelo = "Faber Castel";
        c2.cor = "Preta";
        c1.carga = 85;
        c2.ponta = 1.5;

        // CHAMADA DE METODO
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}