package com.veer.contact_manager_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veer.contact_manager_backend.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
