package screens;


import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import screens.base.BaseScreen;


public class Lista_filmes extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "IDDOELEMENTO")
    private MobileElement nomeDoMapeamento;

    public void SEUMETODO() {
        this.nomeDoMapeamento.isDisplayed();
    }
  

}
