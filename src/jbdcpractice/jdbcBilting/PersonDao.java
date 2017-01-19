/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbdcpractice.jdbcBilting;

import java.util.List;

public interface PersonDao {
	
	public void create(String name, int birth, String city);
	
	public List<Person> getAll();
        public List<Person> getByCity(String city);
        public List<Person> getByBirth(int start, int end);
	public List<Person> getByName(String name);
	public Person getById(int id);
	
	public boolean update(String city, int id);
	
	public boolean delete(int id);
	
}

