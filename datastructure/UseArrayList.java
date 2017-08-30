 package datastructure;
import databases.ConnectDB;

import java.sql.Array;
import java.util.*;
public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<Object> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		 //connect to db
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(list, "user", "Name");
        connectDB.readDataBase("User", "name");
		//using Iterator

		Iterator<Object> it = list.listIterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			list.remove(2);
			for (Object a : list) {
				System.out.println(a);

			}
		}
	}



