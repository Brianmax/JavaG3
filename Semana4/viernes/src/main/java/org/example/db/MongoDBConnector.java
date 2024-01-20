package org.example.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import java.io.InputStream;
import java.util.Properties;

public class MongoDBConnector {

    private static MongoClient mongoClient;
    @Getter
    public static MongoDatabase database;

    public static void connect() {
        Properties properties = loadProperties();
        String connectionString = properties.getProperty("mongodb.url");
        String databaseName = properties.getProperty("mongodb.database");

        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(databaseName);
    }
    private static Properties loadProperties() {
        Properties properties = new Properties();
        try (InputStream input = MongoDBConnector.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Lo siento, no se puede encontrar el archivo de configuración");
                System.exit(1);
            }

            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        return properties;
    }
    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}

