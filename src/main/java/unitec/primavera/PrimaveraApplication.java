package unitec.primavera;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner {

    @Autowired
    RepositorioPagos repoPagos;
    @Autowired
    RepositorioMensajes repoMensa;

    public static void main(String[] args) {
        SpringApplication.run(PrimaveraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        // repoPagos.servicioPagar();

        // Guarda un mensaje
        // repoMensa.save(new Mensajito("SQL vs PHP", "¿Quién ganará?", LocalDate.now()));
        
        /*
        // Buscamos todos los mensajes
        for (Mensajito mensa : repoMensa.findAll()) {
            System.out.println(mensa);
        }
        */
        
        /*
        // Buscamos por ID
        System.out.println(repoMensa.findById("5bb422b4c35d8012e45e0e1d").get());
        */
        
        // Buscar por título
        repoMensa.save(new Mensajito("malo", "yo", "topoyiya", LocalDate.now()));
        System.out.println(repoMensa.findByTitulo("yo"));
        
        repoMensa.delete(new Mensajito("malo"));
        
    }
}
