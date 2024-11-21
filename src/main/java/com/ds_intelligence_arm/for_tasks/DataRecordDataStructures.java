package com.ds_intelligence_arm.for_tasks; 

import com.ds_intelligence_arm.storage.model.news_am_DataRecord;
import com.ds_intelligence_arm.utils.DataStructures;
import com.ds_intelligence_arm.storage.model.auto_am_DataRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class DataRecordDataStructures {

//    public static List<auto_am_DataRecord> readDataRecordsFromJson(String filePath) {
//        List<auto_am_DataRecord> dataRecords = new ArrayList<>();
//        Gson gson = new Gson();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            // Define the type for a List of auto_am_DataRecord
//            Type listType = new TypeToken<List<auto_am_DataRecord>>() {
//            }.getType();
//
//            // Deserialize JSON to List<auto_am_DataRecord>
//            dataRecords = gson.fromJson(reader, listType);
//
//        } catch (IOException e) {
//            System.err.println("Error reading JSON file: " + e.getMessage());
//        }
//
//        return dataRecords;
//    }
//
//    public static void main(String[] args) {
//        // Path to the JSON file
//        String filePath = "src/resources/auto_am.json";
//
//        // Read the data records from the JSON file
//        List<auto_am_DataRecord> records = readDataRecordsFromJson(filePath);

        // Given the List save the records in SingleLinked List defined in DataStructures.
        // Print out using the SingleLinked List: URL, Title, Description, Price in USD, Price in AMD.
//        LinkedList <auto_am_DataRecord> linkedList = new DataStructures.SingleLinkedList();
//        for (auto_am_DataRecord record: records) {
//            linkedList.add(record);
//            System.out.println("URL: " + record.getUrl());
//            System.out.println("Title: " + record.getTitle());
//            System.out.println("Description: " + record.getDescription());
//            System.out.println("Price in USD: " + record.getPriceInUSD());
//            System.out.println("Price in AMD: " + record.getPriceInAMD());
//            System.out.println("-----");
//        }
        // Given the List save the records in Queue defined in DataStructures.
        // Print out using the SingleLinked List: URL, Title, Description, Price in USD, Price in AMD.\
//        Queue <auto_am_DataRecord> dataRecords = (Queue<auto_am_DataRecord>) new DataStructures.Queue();
//        for (auto_am_DataRecord record : records) {
//            dataRecords.equals(record);
//            System.out.println("URL: " + record.getUrl());
//            System.out.println("Title: " + record.getTitle());
//            System.out.println("Description: " + record.getDescription());
//            System.out.println("Price in USD: " + record.getPriceInUSD());
//            System.out.println("Price in AMD: " + record.getPriceInAMD());
//            System.out.println("-----");
//        }
        // Given the List save the records in Stack defined in DataStructures.
        // Print out using the SingleLinked List: URL, Title, Description, Price in USD, Price in AMD.
//        Stack<auto_am_DataRecord> dataRecords = new Stack<>();
//        for (auto_am_DataRecord record : records) {
//            dataRecords.push(record);
//            System.out.println("URL: " + record.getUrl());
//            System.out.println("Title: " + record.getTitle());
//            System.out.println("Description: " + record.getDescription());
//            System.out.println("Price in USD: " + record.getPriceInUSD());
//            System.out.println("Price in AMD: " + record.getPriceInAMD());
//            System.out.println("-----");
//        }
        public static List<news_am_DataRecord> readDataRecordsFromJson_2(String filePath) {
            List<news_am_DataRecord> dataRecords = new ArrayList<>();
            Gson gson = new Gson();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                // Define the type for a List of auto_am_DataRecord
                Type listType = new TypeToken<List<news_am_DataRecord>>() {
                }.getType();

                // Deserialize JSON to List<auto_am_DataRecord>
                dataRecords = gson.fromJson(reader, listType);

            } catch (IOException e) {
                System.err.println("Error reading JSON file: " + e.getMessage());
            }

            return dataRecords;
        }

        public static void main(String[] args) {
            // Path to the JSON file
            String filePath = "src/resources/news_am.json";
             //Read the data records from the JSON file
        List<news_am_DataRecord> records = readDataRecordsFromJson_2(filePath);

             //Given the List save the records in SingleLinked List defined in DataStructures.
             //Print out using the SingleLinked List: URL, Title, Description, Price in USD, Price in AMD.
        LinkedList <news_am_DataRecord> linkedList = new DataStructures.SingleLinkedList();
        for (news_am_DataRecord record: records) {
            linkedList.add(record);
            System.out.println("URL: " + record.getUrl());
            System.out.println("Title: " + record.getTitle());
            System.out.println("Description: " + record.getDescription());
            System.out.println("-----");
        }
    }

}
