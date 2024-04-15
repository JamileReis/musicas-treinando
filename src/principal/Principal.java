package principal;


import modelos.Audio;
import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Principal extends Audio {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setArtista("RBD");
        musica.setTitulo("Y no puedo olvidarte");
        musica.setTotalReproducoes(90);
        musica.setTotalCurtidas(50);

        for (int i = 0; i < 500 ; i++) {
            musica.getreproducao();
        }
        for (int i = 0; i < 500; i++) {
            musica.getcurtida();
        }
        Podcast podcast = new Podcast();
        podcast.setTitulo("Orochi");
        podcast.setDescricao("muita asneira");
        podcast.setTotalReproducoes(85);
        podcast.setTotalCurtidas(30);
        for (int i = 0; i < 100 ; i++) {
            podcast.getreproducao();
        }
        for (int i = 0; i < 50; i++) {
            podcast.getcurtida();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);



    }
}
