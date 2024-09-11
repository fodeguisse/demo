package tp.demo.init;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tp.demo.model.Devise;
import tp.demo.repository.DeviseRepository;

@Component
@Profile("reinit") // nom d'un profil(variant de config) à activer au démarrage
public class InitDataSet {

    @Autowired
    private DeviseRepository deviseRepository;

    @PostConstruct
    public void initData() {
        deviseRepository.save(new Devise("EUR", "Euro", 1.0));
        deviseRepository.save(new Devise("USD", "Dollar", 1.1));
        deviseRepository.save(new Devise("GBP", "Livre", 1.2));
    }
}
