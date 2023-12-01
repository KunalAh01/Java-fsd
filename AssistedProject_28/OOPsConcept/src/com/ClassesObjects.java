package com;


class Students {
	int id;
    String name; 
    int rollno;
    public Students(int id,String name,int rollno) 
    { 
    	this.id=id;
        this.name = name; 
        this.rollno = rollno; 
    } 
   
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return rollno;
	}

	public void setSalary(int salary) {
		this.rollno = rollno;
	}
	
@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}


public class ClassesObjects {

	public static void main(String[] args) {
		
		  
		Students s1=new Students(101, "Mohit", 20000);
		       System.out.println(s1.toString());
		    } 
		}


	}


