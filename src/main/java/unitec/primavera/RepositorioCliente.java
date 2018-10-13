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
public interface RepositorioCliente extends MongoRepository<Cliente, String>{
    ArrayList<Cliente> findByNombre(String nombre);
}
