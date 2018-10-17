/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")
public class ControladorCliente {
    @Autowired RepositorioCliente c;
    
    @GetMapping(path="/rube11_7")
    public String rube11_7()
    {
        return "Soy un psíquico en la programación. :D";
    }
    
    // Buscamos todos
    @GetMapping(path="/clientes")
    public List<Cliente> todos()
    {
        return c.findAll();
    }
    
    // Buacamos por id
    @GetMapping(path="/clientes/{id}")
    public Cliente buscarPorId(@PathVariable String id)
    {
        return c.findById(id).get();
    }
    
    // Vamos a guardar para ello SIEMPRE SE OCUPA EL POST
    @PostMapping(path="/clientes", consumes="application/json")
    public Estatus guardar(@RequestBody String json) throws Exception
    {
        // Recibimos a json con los brazos abiertos!!
        ObjectMapper maper=new ObjectMapper();
        Cliente cliente= maper.readValue(json, Cliente.class);
        System.out.println(cliente);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Cliente guardado con exitoooo!!");
        return estatus;
    }
}
