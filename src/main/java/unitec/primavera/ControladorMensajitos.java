/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://angular-fhwsnn.stackblitz.io"})
public class ControladorMensajitos {
    @Autowired RepositorioMensajes mensa;
    // Mi primer Hola Mundo desde REST API
    @GetMapping(path="/hola")
    public String hola()
    {
        return "Hola Mundo";
    }
    
    // Buscamos todos
    @GetMapping(path="/mensaje")
    public List<Mensajito> todos()
    {
        return mensa.findAll();
    }
    
    // Buacamos por id
    @GetMapping(path="/mensaje/{id}")
    public Mensajito buscarPorId(@PathVariable String id)
    {
        return mensa.findById(id).get();
    }
    
    // Vamos a guardar para ello SIEMPRE SE OCUPA EL POST
    @PostMapping(path="/mensaje", consumes="application/json")
    public Estatus guardar(@RequestBody String json) throws Exception
    {
        // Recibimos a json con los brazos abiertos!!
        ObjectMapper maper=new ObjectMapper();
        Mensajito mensajito= maper.readValue(json, Mensajito.class);
        System.out.println(mensajito);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensajito guardado con exitoooo!!");
        return estatus;
    }
}