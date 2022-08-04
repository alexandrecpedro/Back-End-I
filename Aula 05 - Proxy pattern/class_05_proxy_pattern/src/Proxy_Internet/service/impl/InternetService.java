package Proxy_Internet.service.impl;

import Proxy_Internet.service.IConexionInternet;

public class InternetService implements IConexionInternet {

    @Override
    public void conectarCom(String url) {
        System.out.println("Conectando com "+url);
    }
}
