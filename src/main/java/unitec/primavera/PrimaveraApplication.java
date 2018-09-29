package unitec.primavera;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner {
    
    @Autowired RepositorioPagos repoPagos;
    @Autowired RepositorioMensajes repoMensa;
    
	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        repoPagos.servicioPagar();
        repoMensa.save(new Mensajito("Hola", "Puerco", LocalDate.now()));
    }
}
