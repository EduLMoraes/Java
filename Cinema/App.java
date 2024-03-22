public class App{
    public static void main(String[] args){
        MovieTheater mt = new MovieTheater(12, "Room 12");

        Film film = new Film("Manda Gangstar", 124, mt);
        Film film2 = new Film("Cachorro de sapatilhas", 80, mt);
        Film film3 = new Film("Aranha Home", 140, mt);

        System.out.println("|Sessão....: 1" );
        System.out.println("|-----------" );
        System.out.println("|Sala......: " + film.getRoom().getName());
        System.out.println("|Título....: " + film.getTitle());
        System.out.println("|Duração...: " + film.getTime());
        System.out.println("|__________: ");

        System.out.println("|Sessão....: 2" );
        System.out.println("|-----------" );
        System.out.println("|Sala......: " + film2.getRoom().getName());
        System.out.println("|Título....: " + film2.getTitle());
        System.out.println("|Duração...: " + film2.getTime());
        System.out.println("|__________: ");

        System.out.println("|Sessão....: 3" );
        System.out.println("|-----------" );
        System.out.println("|Sala......: " + film3.getRoom().getName());
        System.out.println("|Título....: " + film3.getTitle());
        System.out.println("|Duração...: " + film3.getTime());
        System.out.println("|__________: ");

    }
}