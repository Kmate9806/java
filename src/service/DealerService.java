package service;

import model.Dealer;
import persist.exceptions.DealerAlreadyExistException;
import persist.exceptions.DealerNotFoundException;
import persist.inmemorydb.InMemoryDealerDatabase;
import persist.interfaces.DealerRepository;

import java.util.List;

public class DealerService {
    private DealerRepository dealerRepository;
    public DealerService(){
        dealerRepository = new InMemoryDealerDatabase();

    }
    public int addDealer(Dealer dealer) throws DealerAlreadyExistException {
        dealerRepository.addNewDealer(dealer);
        return dealer.getTaxNumber();
    }

    public void deleteDealer(int taxNumber) throws DealerNotFoundException {
        dealerRepository.deleteDealer(taxNumber);
    }

    public void updateDealerName(int taxNumber, String name) throws DealerNotFoundException {
        dealerRepository.updateDealerName(taxNumber,name);
    }

    public Dealer getDealerByTaxNumber(int taxNumber) throws DealerNotFoundException {
        return dealerRepository.getDealer(taxNumber);
    }

    public List<Dealer> getAllDealers() {
        return dealerRepository.getAllDealers();
    }
}
