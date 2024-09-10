package tp.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.demo.model.Devise;
import tp.demo.service.ServiceDevise;

import java.util.List;

@RestController //Composant Spring de type controller de WS REST
@RequestMapping(value = "/devise" , headers="Accept=application/json")
public class DeviseRestController {

    @Autowired
    private ServiceDevise serviceDevise;

    //url de test : http://localhost:8181/demo/devise
    @GetMapping("")
    public List<Devise> getAllDevises(){
        return serviceDevise.findAllDevises();
    }


}
