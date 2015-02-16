package se.malmo.www.kontaktruta.service;

import se.malmo.www.kontaktruta.model.APISuggestion;

public interface ContactService {
    
    public <T extends APISuggestion> T getContactByName(String contactType, String name, Class<T> classType);
    public <T> T getContactList(String contactType, String query, Class<T> classType);
    public <T extends APISuggestion> T getContact(String contactType, String id, Class<T> classType);
}
