package com.vk.quasys;

import java.util.*;

public class DocumentStore {
    private Collection<String> documents = new ArrayList<String>();
    private int capacity;

    public DocumentStore(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() { 
      return capacity;
    }

    public Collection<String> getDocuments() {
      return documents; 
    }

    public void addDocument(String document) {
        if (this.documents.size() > capacity)
            throw new IllegalStateException();

        documents.add(document);
    }
    
    @Override 
    public String toString() {
        return String.format("Document store: {%d}/{%d}", documents.size(), capacity);
    }
    
    public static void main(String[] args) {
    	    
    	    int maxlength = 5; //This can be taken from the console by System.console().read
    	    int i = 0;
        DocumentStore documentStore = new DocumentStore(maxlength);
        while(i <= maxlength) {
            documentStore.addDocument("item " +i);
            i++;
        }

        
        System.out.println(documentStore.toString());
    }
}
