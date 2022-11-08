package com.gl.javafsd.dsa.balancedbrackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//Purpose of this class
//validate balance brackets

public class BalancedBracketsChecker {
	
	private String brackets;
	//if the number of  characters to check is more using if condition on each character is irrelevant , hence we use set
	//The set interface is present in java.util package
	//The HashSet class implements the Set interface we need to use a class to implement
	private Set<Character> openBracketSet;
	private Set<Character> closedBracketSet;
	private Stack<Character> bracketStack;
	
	//constructor
	//to accept the string(brackets) from user
	public BalancedBracketsChecker(String brackets){
		this.brackets=brackets;
	
		closedBracketSet=new HashSet<>();
		bracketStack=new Stack<>();
	
	}

//to retrieve a single character from a string
//charAt() is a method that returns the character from the specified index.
//method to check if brackets are balanced if yes, it returns true
     public boolean check() {
    	 if(brackets.length()==0) {
    		 return false;
    	 }
    	 if(brackets.length() %2 != 0) {
    		 return false;
    	 }
    	 openBracketSet=BracketsUtils.getOpenBrackets();
    	 closedBracketSet=BracketsUtils.getCloseBrackets();
    	 
    	 
	 for(int i=0; i<brackets.length(); i++) {
     char aCharacter=brackets.charAt(i);
//([{char aCharacter=brackets.charAt(i);
//check for characters that represent the open brackets
//check for characters that represent the closed brackets	
     
   if(openBracketSet.contains(aCharacter)) {
	   //when we encounter a open character add to a stack
	   bracketStack.push(aCharacter);
   }
	  
   else if(closedBracketSet.contains(aCharacter)) {
	   //when we encounter a close character pop it out and compare with the one on top of stack 
	 
	  BracketPair bracketPairObj=BracketsUtils.getBracketPair(aCharacter);
	  Character openBracketCharFromStack=bracketStack.pop();

	  
	  if(bracketPairObj.getOpenChar().equals(openBracketCharFromStack)) {
		  //Match is correct
	  }else {
		  return false;
				  }
	  
	  }else {
		  System.out.println("invalid characters->" + aCharacter);
	  }  
        }

   //success condition stack is empty  
   //all push elements undergone pop operation
   boolean successCondition =   bracketStack.isEmpty();
   if(successCondition ) {
	   return true;
	   }
   else {
	   return false;
   }
	
	 }
	
 }	

