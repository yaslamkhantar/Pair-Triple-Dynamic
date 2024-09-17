package elmoukhantar.yass.agencevoyage.service;

import elmoukhantar.yass.agencevoyage.entities.Agence;
import elmoukhantar.yass.agencevoyage.entities.Ceo;
import elmoukhantar.yass.agencevoyage.entities.Transport;
import elmoukhantar.yass.agencevoyage.repsoritory.Agencerepo;
import elmoukhantar.yass.agencevoyage.repsoritory.Ceorepo;
import elmoukhantar.yass.agencevoyage.repsoritory.Transportrepo;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Agenceinfo {

    private Agencerepo agencerepo;
    private Ceorepo ceorepo;
    private Transportrepo transportrepo;

    public Agence getAgence(String id){
      return  agencerepo.findById(id).get();
    }
    public Transport getTransport(int id){
        return  transportrepo.findById(id).get();
    }
    public Ceo getCeo(String  id){
        return  ceorepo.findById(id).get();
    }

    public Pair<Agence,Transport> getInfo(String agenceId,Integer transportId){
        Agence ag1= agencerepo.findById(agenceId).get();
        Transport tr1=transportrepo.findById(transportId).get();
        return Pair.of(ag1,tr1);
    }
    public Triple<Agence,Transport,Ceo> getAllInfo(String agenceId, Integer transportId, String ceoId){
        Agence ag1= agencerepo.findById(agenceId).get();
        Transport tr1=transportrepo.findById(transportId).get();
        Ceo ceo1=ceorepo.findById(ceoId).get();
        return Triple.of(ag1,tr1,ceo1);
    }



}
