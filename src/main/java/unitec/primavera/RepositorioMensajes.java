/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-107
 */
public interface RepositorioMensajes extends MongoRepository<Mensajito, String> {
    ArrayList<Mensajito> findByTitulo(String titulo);
}
