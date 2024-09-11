package tp.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import tp.demo.model.Devise;
import tp.demo.repository.DeviseRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
@ActiveProfiles("h2")
public class TestServiceDevise {

    @Autowired
    private ServiceDevise serviceDevise; // à tester

    @Autowired
    private DeviseRepository deviseRepository;

    public void initData(){
        deviseRepository.save(new Devise("EUR","Euro",1.0) );
        deviseRepository.save(new Devise("USD","Dollar",1.1) );
        deviseRepository.save(new Devise("GBP","Livre",1.2) );
    }

    /*
    @BeforeEach
    public void init(){
        serviceDevise=new ServiceDevise(); //V1 en court circuitant Spring
        //la V2 avec @springBootTest et @Autowired est mieux en Spring
    }
    */


    @Test
    public void testFindAllDevise(){
        initData();
        List<Devise> liste = serviceDevise.findAllDevises();
        assertTrue(liste.size()>=2,
                "la taille de la liste devrait etre >=2");
    }

}
