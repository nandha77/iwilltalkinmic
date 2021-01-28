package com.cg.constructor;

public class Constructor1 {
	private String name;
	private int regNo;
	private int stdId;
	private static String clgName;
static
{
	clgName="kgcas";
}

public Constructor1() {
	super();
	System.out.println("it is non arg constructor");
}

public Constructor1(String name, int regNo, int stdId) {
	super();
	this.name = name;
	this.regNo = regNo;						
	this.stdId = stdId;
    System.out.println("it is parameterized constructor");
	System.out.println("the name:"+name+"\nthe Regno:"+regNo+"\nID:"+stdId);


}

public Constructor1(String name, int regNo) {
	super();
	this.name = name;
	this.regNo = regNo;
	System.out.println("the name:"+name+"\nRegNo:"+regNo);
}
	

}
