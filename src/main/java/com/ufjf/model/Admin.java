// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C

package com.ufjf.model;

import java.io.File;
import java.util.ArrayList;

public class Admin extends User{
    public Admin(String usr, String nm, String pswrd){
		setUsername(usr);
		setName(nm);
		setPassword(pswrd);
		userType = 2;
	}
	
	public ArrayList<String> getSubjects(){
		new File("./Disciplinas").mkdirs();
		File folder = new File("./Disciplinas");
		File[] files = folder.listFiles();
		ArrayList<String> subjects = new ArrayList<String>();
		for (File file : files) {
			if (file.isFile()) {
				subjects.add(file.getName().replace(".json", ""));
			}
		}
		return subjects;
	}
        
       public void addSubject(String i){
           
       }

}