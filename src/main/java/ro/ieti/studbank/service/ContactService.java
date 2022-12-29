package ro.ieti.studbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ieti.studbank.model.Contact;
import ro.ieti.studbank.repository.ContactRepository;

import java.util.Date;
import java.util.Random;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;


    public Contact saveContact(Contact contact) {
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        contact.setContactId(getServiceReqNumber());
        return repository.save(contact);
    }

    private String getServiceReqNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + randomNumber;
    }
}
