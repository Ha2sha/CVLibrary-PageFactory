package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobList")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30001", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"IT", "Harrow", "up to 7 miles", "401", "500", "Per day", "Contract", "It jobs in Harrow on the Hill"},
                {"Test Analyst", "London", "up to 15 miles", "40001", "50000", "Per annum", "Contract", "Contract Test Analyst jobs in London"},
                {"Tester", "Watford, Hertfordshire", "up to 5 miles", "40001", "60000", "Per annum", "Contract", "Contract Tester jobs in Watford"},
                {"Accountant", "Harrow Weald, Greater London", "up to 5 miles", "30001", "60000", "Per annum", "Permanent", "Permanent Accountant jobs in Harrow Weald"},
                {"Retail Manager", "West London", "up to 10 miles", "35001", "50000", "Per annum", "Permanent", "Permanent Retail Manager jobs in West London"},
                {"Automation Tester", "London", "up to 7 miles", "301", "500", "Per day", "Contract", "Contract Automation Tester jobs in London"},
                };
        return data;
    }

}
