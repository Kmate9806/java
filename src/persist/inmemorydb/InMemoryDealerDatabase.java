package persist.inmemorydb;

import model.Dealer;
import persist.exceptions.DealerAlreadyExistException;
import persist.exceptions.DealerNotFoundException;
import persist.interfaces.DealerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDealerDatabase implements DealerRepository {

    private HashMap<Integer, Dealer> dealerDatabase;

    public InMemoryDealerDatabase(){

        dealerDatabase = new HashMap<>();
    }

    @Override
    public void addNewDealer(Dealer dealerNew) throws DealerAlreadyExistException {
        if (!dealerDatabase.containsKey(dealerNew.getTaxNumber())) {
           dealerDatabase.put(dealerNew.getTaxNumber(),dealerNew);
        } else {
            throw new DealerAlreadyExistException();
        }
    }


    @Override
    public void deleteDealer(int taxNumber) throws DealerNotFoundException{
        if (!dealerDatabase.containsKey(taxNumber)) {
            //throw new DealerNotFoundException();
        }
        dealerDatabase.remove(taxNumber);
    }

    @Override
    public void updateDealer(Dealer dealer) throws DealerNotFoundException {
        if (!dealerDatabase.containsKey(dealer.getTaxNumber())) {
            throw new DealerNotFoundException();
        }
        dealerDatabase.put(dealer.getTaxNumber(), dealer);

    }
    @Override
    public void updateDealerName(int taxNumber, String name) throws DealerNotFoundException {
        if (!dealerDatabase.containsKey(taxNumber)) {
            throw new DealerNotFoundException();
        }
        dealerDatabase.get(taxNumber).setName(name);
    }



    @Override
    public Dealer getDealer(int taxNumber) throws DealerNotFoundException {
        if (!dealerDatabase.containsKey(taxNumber)) {
            throw new DealerNotFoundException();
        }
        return dealerDatabase.get(taxNumber);
    }
    @Override
    public List<Dealer> getAllDealers() {
        List<Dealer> list = new ArrayList<>();
        for (Map.Entry<Integer, Dealer> entry : dealerDatabase.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
