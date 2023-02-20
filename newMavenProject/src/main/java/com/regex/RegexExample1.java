package com.regex;

import java.util.regex.*;
public class RegexExample1{
public static void main(String args[]){
//1st way
Pattern p = Pattern.compile("[A-Za-z0-9.-_]+@[a-z.-_]+\\.[a-z]{2,6}$");//. represents single character
Matcher m = p.matcher("asg.pawar.56@gsgcomsss");
boolean b = m.matches();
System.out.println("regex pattern for email - asg.pawar.56@gsgcomsss - " + b);
//2nd way
boolean b2=Pattern.compile("[A-Za-z0-9.-_]+@[a-z.-_]+\\.[a-z]{2,6}$").matcher("asg.pawar56@gsg.comsss").matches();
System.out.println("regex pattern for email - asg.pawar56@gsg.comsss -" + b2);
//3rd way
boolean b3 = Pattern.matches("[0-9]{10}$", "1234567825");
System.out.println("regex pattern for phone number - 1234567895 - " + b3);


boolean b4 = Pattern.matches("[0-9]{10}$", "12345678");
System.out.println("regex pattern for phone number - 12345678 - " + b4);

boolean b5 = Pattern.matches("[0-9]{10}$", "123456785698");
System.out.println("regex pattern for phone number - 123456785698 - " + b5);

}}

