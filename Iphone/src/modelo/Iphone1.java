package modelo;

import hardware.IphoneMolde;

public class Iphone1 extends IphoneMolde {
    @Override
    public void gravarVideo() {
        System.out.println("Gravando video");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto");
    }

    @Override
    public void ligar() {
        System.out.println("Discando numero");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo video");
    }
}
