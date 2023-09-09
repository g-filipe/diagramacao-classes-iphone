package com.gfilipeprojects.diagramacao_classe_iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo a ligação de " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz... " + mensagem);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página de " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a reprodução da música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música desejada...");
    }
}