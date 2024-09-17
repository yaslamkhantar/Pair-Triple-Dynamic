package elmoukhantar.yass.agencevoyage;

import elmoukhantar.yass.agencevoyage.entities.Agence;
import elmoukhantar.yass.agencevoyage.entities.Ceo;
import elmoukhantar.yass.agencevoyage.entities.Transport;
import elmoukhantar.yass.agencevoyage.repsoritory.Agencerepo;
import elmoukhantar.yass.agencevoyage.repsoritory.Ceorepo;
import elmoukhantar.yass.agencevoyage.repsoritory.Transportrepo;
import elmoukhantar.yass.agencevoyage.service.Agenceinfo;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AgenceVoyageApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgenceVoyageApplication.class, args);
    }


    @Autowired
    private Agenceinfo agenceinfo;
    @Bean
    CommandLineRunner start(Agencerepo agencerepo, Ceorepo ceorepo, Transportrepo transportrepo){
        return args -> {

            Agence agence1=new Agence("ARTO","JBAL-BLADI","CASABLANCA");
            Agence agence2=new Agence("QIZDO","MARROCAN-TRAVEL","RABAT");
            Agence agence3=new Agence("WXCV","VIP-VOYAGE","TANGER");
            agencerepo.save(agence1);
            agencerepo.save(agence2);
            agencerepo.save(agence3);

            transportrepo.save(new Transport(2,"VOYAGE","CASA-RABAT","AAAA"));
            transportrepo.save(new Transport(4,"VOYAGE","CASA-FES","BBBB"));
            transportrepo.save(new Transport(6,"IMPORT-EXPORT","CASA-AGADIR","CCCC"));

            ceorepo.save(new Ceo("sssd","akhniniche","smail","adress 4"));
            ceorepo.save(new Ceo("fffd","elmoukhantar","yassine","adress 6"));
            ceorepo.save(new Ceo("hjop","erraji","abdelhaq","adress 8"));

            Agence a1=agenceinfo.getAgence("ARTO");
            Transport t1=agenceinfo.getTransport(4);
            Ceo c1=agenceinfo.getCeo("sssd");

            System.out.println("Agence --> "+a1+"/n Transport -->"+t1+"/n Ceo "+c1);

            Pair<Agence,Transport> pair1=agenceinfo.getInfo("ARTO",4);
            System.out.println("info about agence using pair "+pair1.getLeft());
            System.out.println("info about transport using pair "+pair1.getRight());

            Triple<Agence,Transport,Ceo> Triple1=agenceinfo.getAllInfo("ARTO",4,"fffd");
            System.out.println("info about agence using Triple "+Triple1.getLeft());
            System.out.println("info about ceo using Triple "+Triple1.getRight());
            System.out.println("info about transport using Triple "+Triple1.getMiddle());





        };
    }

}
