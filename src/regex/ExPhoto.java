package regex;

public class ExPhoto {

    public static void main(String[] args) {

        // Passamos o nome dos arquivos para serem processados pelo nosso método personalizado
        Photo photo1 = Photo.createFromFileName("IMG_00013-1988-Sao_Paulo.jpg");
        Photo photo2 = Photo.createFromFileName("IMG_00013-1999-Florianopolis.jpg");
        Photo photo3 = Photo.createFromFileName("IMG_234-2015-Rio_de_Janeiro.jpg");

        // Exibe o resultado da conversão
        System.out.println(photo1);
        System.out.println(photo2);
        System.out.println(photo3);

    }
}
