package smartphone;

import service.SmartPhoneService;

public class Iphone extends SmartPhoneService {

    @Override
    public void selecionarMusica() { System.out.println("SELECIONANDO FAIXA MUSICAL NO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA WEB NO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PAGINA WEB NO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA WEB NO IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TELEFONE TOCANDO NO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA NO IPHONE");
    }

    @Override
    public void ligar() {
        System.out.println("INICIANDO CHAMADA DE VOZ NO IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA DE VOZ NO IPHONE");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
    }
}
