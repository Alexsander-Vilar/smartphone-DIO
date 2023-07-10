import smartphone.Galaxy;
import smartphone.Iphone;

public class main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Galaxy galaxy = new Galaxy();

        iphone.ligar();
        galaxy.atender();
        galaxy.ligar();
        iphone.iniciarCorrerioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}
