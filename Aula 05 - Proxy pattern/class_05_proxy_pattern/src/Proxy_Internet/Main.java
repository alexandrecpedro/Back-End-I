package Proxy_Internet;

import Proxy_Internet.service.IConexionInternet;
import Proxy_Internet.service.impl.InternetService;
import Proxy_Internet.service.impl.ProxyInternet;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> sitesBloqueados = Arrays.asList("www.youtube.com","www.facebook.com");
        IConexionInternet proxy = new ProxyInternet(sitesBloqueados,new InternetService());

        proxy.conectarCom("www.google.com");
        proxy.conectarCom("www.youtube.com");
    }
}
