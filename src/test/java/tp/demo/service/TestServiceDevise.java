package tp.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tp.demo.model.Devise;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class TestServiceDevise {

    @Autowired
    private ServiceDevise serviceDevise; // à tester

    /*
    @BeforeEach
    public void init(){
        serviceDevise=new ServiceDevise(); //V1 en court circuitant Spring
        //la V2 avec @springBootTest et @Autowired est mieux en Spring
    }
    */


    @Test
    public void testFindAllDevise(){
        List<Devise> liste = serviceDevise.findAllDevises();
        assertTrue(liste.size()>=2);
    }

}
