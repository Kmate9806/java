package persist.interfaces;

import model.Dealer;
import persist.exceptions.DealerAlreadyExistException;
import persist.exceptions.DealerNotFoundException;

import java.util.List;

public interface DealerRepository {
    void addNewDealer(Dealer dealer) throws DealerAlreadyExistException;

    void deleteDealer(int taxNumber) throws DealerNotFoundException;

    void updateDealer(Dealer dealer) throws  DealerNotFoundException;

    void updateDealerName(int taxNumber, String name) throws DealerNotFoundException;



    Dealer getDealer(int taxNumber) throws DealerNotFoundException;

     List<Dealer> getAllDealers();

    }

