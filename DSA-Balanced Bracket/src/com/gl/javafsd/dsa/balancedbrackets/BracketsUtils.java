package com.gl.javafsd.dsa.balancedbrackets;

import java.util.HashSet;
import java.util.Set;

//class having helper methods for other class
public class BracketsUtils {
	//utily class usually supplies for other class so no need of constructors
	//to set variables we can use static blocks
	
	static Set<BracketPair> bracketPairSet=new HashSet<>();

	static {
		BracketPair one= new BracketPair('(',')');
		BracketPair two= new BracketPair('[',']');
		BracketPair three= new BracketPair('{','}');
		
		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);
		
	}	
		//add this to collection and can use collection later

	
//But we cannot add the above objects to set collection since its in static blocks
//change set collection to static
//cant use for loop with index in set collections
//it will run 3 times
 static  BracketPair getBracketPair(Character closeBracketChar){
		for (BracketPair aBracketPair: bracketPairSet) {
			
			if(aBracketPair.getCloseChar().equals(closeBracketChar)) {
				return aBracketPair;
			}
			
		}
	 return null;
	 
	}
	static Set <Character>getOpenBrackets(){
		
		Set<Character>results=new HashSet<>();
for (BracketPair aBracketPair: bracketPairSet) {
		results.add(aBracketPair.getOpenChar());
		}
	 return results;
}

static Set <Character>getCloseBrackets(){
	
	Set<Character>results=new HashSet<>();
for (BracketPair aBracketPair: bracketPairSet) {
	results.add(aBracketPair.getCloseChar());

	}
 return results;
}
}
