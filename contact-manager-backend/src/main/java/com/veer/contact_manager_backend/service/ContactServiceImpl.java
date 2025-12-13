package com.veer.contact_manager_backend.service;

import com.veer.contact_manager_backend.model.Contact;
import com.veer.contact_manager_backend.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        return contactRepository.findById(id)
                .orElse(null); // later we can throw exception
    }

    @Override
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Long id, Contact updatedContact) {
        return contactRepository.findById(id)
                .map(existing -> {
                    existing.setName(updatedContact.getName());
                    existing.setEmail(updatedContact.getEmail());
                    existing.setPhone(updatedContact.getPhone());
                    existing.setCompany(updatedContact.getCompany());
                    existing.setNote(updatedContact.getNote());
                    return contactRepository.save(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
