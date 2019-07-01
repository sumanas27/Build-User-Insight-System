package com.sumanasaha.UserInsightSystem.resource;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sumanasaha.UserInsightSystem.models.UserInsightAmenitiesItem;
import com.sumanasaha.UserInsightSystem.models.UserInsightHotelClickItem;
import io.swagger.models.auth.In;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UserInsightResourceReader {

    private static final String SELECTIONS_CSV_FILE_PATH = "./selections.csv";
    private static final String CLICKS_CSV_FILE_PATH = "./clicks.csv";

    public List<UserInsightAmenitiesItem> fetchUserAmenities()throws IOException{
        List<UserInsightAmenitiesItem> ret = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SELECTIONS_CSV_FILE_PATH));
        ) {
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                ret.add(new UserInsightAmenitiesItem(
                        Integer.parseInt(nextRecord[0]),
                        Integer.parseInt(nextRecord[1]),
                        Integer.parseInt(nextRecord[2])));
            }
        }
        return ret;
    }

    public List<UserInsightHotelClickItem> fetchUserHotels()throws IOException{
        List<UserInsightHotelClickItem> ret = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CLICKS_CSV_FILE_PATH));
        ) {
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                ret.add(new UserInsightHotelClickItem(
                        Integer.parseInt(nextRecord[0]),
                        Integer.parseInt(nextRecord[1]),
                        Integer.parseInt(nextRecord[2]),
                        nextRecord[3]));
            }
        }
        return ret;
    }
}
