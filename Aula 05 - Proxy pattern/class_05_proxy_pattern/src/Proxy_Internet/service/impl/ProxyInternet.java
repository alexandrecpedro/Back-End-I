package Proxy_Internet.service.impl;

import Proxy_Internet.service.IConexionInternet;

import java.util.List;

public class ProxyInternet implements IConexionInternet {
    private InternetService internetService;
    private List<String> sitesBloqueados;

    public ProxyInternet(List<String> sitesBloqueados, InternetService internetService) {
        this.sitesBloqueados = sitesBloqueados;
        this.internetService = internetService;
    }
 //// Se a url a qual queremos nos conectar não estiver na lista de sites bloqueados, nos conectamos.
    @Override
    public void conectarCom(String url) {
        if(!this.sitesBloqueados.contains(url))
            this.internetService.conectarCom(url);
        else
            System.out.println("Acesso negado");
    }
}
