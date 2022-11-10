package com.bridgelab.IndianCensusAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {
    private String INDIAN_CENSUS_CSV_FILE_PATH = "C:\\Users\\Shivam computers\\Desktop\\New folder\\IndiaStateCensusData.csv";

    /**
     * Tc1.1Given the StatesCensus CSV file, Check to ensure the Number of Record matches
     * This is a Happy Test Case where the record are checked
     */
    @Test
    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int count = censusAnalyser.loadIndiaCensusData(INDIAN_CENSUS_CSV_FILE_PATH);
        Assert.assertEquals(0, count);
    }

}
