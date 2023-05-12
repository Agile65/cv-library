package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="jobParameters")
    public Object[][] getData(){

        Object[][] data=new Object[][]
                {
                        {"Tester","Harrow","5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                       {"Test Lead","Sutton","5 miles","40000","600000","Per annum","Permanent","Permanent Test Lead jobs in Sutton"},
                        {"Tester","Brighton","5 miles","40000","500000","Per annum","Permanent","Permanent Tester jobs in Brighton"},
                        {"Tester","Crawley","5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Crawley"},
                        {"Tester","Kingston","5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Kingston upon Thames"},
                        {"Test Lead","Modern","5 miles","40000","600000","Per annum","Permanent","Permanent Test Lead jobs"},
                };
        return data;
    }

}
