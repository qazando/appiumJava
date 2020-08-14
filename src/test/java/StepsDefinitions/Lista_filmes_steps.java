package StepsDefinitions;

import cucumber.api.java.pt.*;
import screens.Lista_filmes;

public class Lista_filmes_steps {

	Lista_filmes lista;

    public Lista_filmes_steps() {

        lista = new Lista_filmes();
    }
	
	@Dado("^que estou na lista de filmes$")
	public void queEstouNaListaDeFilmes() throws Throwable {
		this.lista.SEUMETODO();
	}

}
