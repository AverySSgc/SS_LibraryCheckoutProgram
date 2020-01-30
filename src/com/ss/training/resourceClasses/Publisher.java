package com.ss.training.resourceClasses;

import java.util.Map;

//Main Class file for publisher
public class Publisher {
    //Publisher variables
    private int keyID;
    private String publisherName;

    //counter is used to keep track of the highest keyID for any instance of Publisher
    //  for use of assigning new keyID to new instances of Publisher
    public static int counter= 0;

    /**
     *
     * @param name - name of publisher
     * Takes a name of a publisher and creates and instance of it.
     * Gives it the id number from the counter
     * Updates the new counter
     */
    public Publisher(String name) {
        this.publisherName= name;
        this.keyID= Publisher.counter;
        Publisher.counter++;
    }

    //Set up get and set for variables
    public int getKeyID() {
        return keyID;
    }

    public Publisher(int keyID, String publisherName) {
        this.keyID = keyID;
        this.publisherName = publisherName;
    }

    public void setKeyID(int keyID) {
        this.keyID = keyID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    //prints to console
    public void printToConsole(){
        System.out.println("ID: " + this.keyID + " Name : " + this.publisherName);
    }


    //Necessary map functionality
    static public int addToMap(Map<Integer,Publisher> pubMap, String publisherName) {
        Publisher p = new Publisher(Publisher.counter, publisherName);
        pubMap.put(Publisher.counter, p);
        Publisher.counter++;
        return Publisher.counter;
    }

    static public void deleteFromMap() {

    }

    static public void printMapToConsole(Map<Integer,Publisher> pubMap) {
        System.out.println("Full List of Publishers \n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        pubMap.forEach((k,v)-> v.printToConsole());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    static public void printMapToTxtFile() {

    }




    }
