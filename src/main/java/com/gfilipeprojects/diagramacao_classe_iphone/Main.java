package com.gfilipeprojects.diagramacao_classe_iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.adicionarNovaAba("www.novaaba.com");
        iphone.atender("+55 81 998776655");
        iphone.atualizarPagina();
        iphone.ligar("+55 83 990992838");
        iphone.pausar();
        iphone.exibirPagina("www.google.com.com");
        iphone.iniciarCorreioVoz("Olá, preciso falar com você. me liga de volta", "Filipe");
        iphone.selecionarMusica();

    }
}
