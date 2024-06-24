package com.springcore.standalone.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Set<String> address;
    private Map<String , String> courses;
    private Properties properties; 

    public void setFriends(List<String> friends){
        this.friends = friends;
    }

    public List<String> getFriends(){
        return friends;
    }

    public void setAddress(Set<String> address){
        this.address = address;
    }

    public Set<String> getAddress(){
        return address;
    }

    public void setCourses(Map<String,String> courses){
        this.courses = courses;
    }

    public Map<String , String> getCourses(){
        return courses;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    
    public String toString(){
        return "Person [ Friends = " + friends + " Address = " + address + " Courses = " + courses + "Properties = " + properties + " ]";
    }

}
