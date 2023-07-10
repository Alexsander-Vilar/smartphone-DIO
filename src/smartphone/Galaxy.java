package smartphone;

import service.SmartPhoneService;

public class Galaxy extends SmartPhoneService {

    @Override
    public void selecionarMusica() { System.out.println("SELECIONANDO FAIXA MUSICAL NO GALAXY");
    }

    @Override
    public void exibirPagina() { System.out.println("EXIBINDO PAGINA WEB NO GALAXY");
    }

    @Override
    public void adicionarNovaAba() { System.out.println("ADICIONANDO NOVA PAGINA WEB NO GALAXY");
    }

    @Override
    public void atualizarPagina() { System.out.println("ATUALIZANDO PAGINA WEB NO GALAXY");
    }

    @Override
    public void tocar() { System.out.println("TELEFONE TOCANDO NO GALAXY");
    }

    @Override
    public void pausar() { System.out.println("PAUSANDO MUSICA NO GALAXY");
    }

    @Override
    public void ligar() { System.out.println("INICIANDO CHAMADA DE VOZ NO GALAXY");
    }

    @Override
    public void atender() { System.out.println("ATENDENDO CHAMADA DE VOZ NO GALAXY");
    }

    @Override
    public void iniciarCorrerioVoz() { System.out.println("INICIANDO CORREIO DE VOZ NO GALAXY");
    }
}
