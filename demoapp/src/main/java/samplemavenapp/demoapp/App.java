package samplemavenapp.demoapp;

import samplemavenapp.accessdb.AccessDB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AccessDB dao = new AccessDB();
        try {
			dao.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
