package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
        String word = "";
    
        for (int i = 0; i < str.length(); i++ ){
            if (!(str.substring(i, i + 1).equals("a"))){
                String x = str.substring(i, i + 1);
                word = word + x;
            }
        }
       return word;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
        String word = "";
        int i = 0;
        while (i < str.length()){
            if (!(str.substring(i, i + 1).equals("a"))){
                String x = str.substring(i, i + 1);
                word = word + x;
            }
            i++;
        }
    
       return word;
       
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
        String word = "";
        for (int i = str.length() - 1; i >= 0; i--){
            if ( i == 0){
                word = str.substring(str.length()- 1, str.length()) + word;
                break;
            }
            word = word + str.substring(i - 1, i);
        }
       return word;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
       String word = "";
        for (int i = 0; i < str.length(); i++){
            
            word = str.substring(i, i + 1) + word;
        }
       return word;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        String word = "";
        for (int i = 0; i < origStr.length(); i++){
            if (searchChar.equals(origStr.substring(i, i + 1))){
                word = word + replaceChar;
            } else {
                word = word + origStr.substring(i, i+1);
            }
        }
    
        return word;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
       String word = "";
        int i = 0;
        while (i < origStr.length()){
             if (searchChar.equals(origStr.substring(i, i + 1))){
                word = word + replaceChar;
            } else {
                word = word + origStr.substring(i, i+1);
            }
            i++;
        }
    
        return word;
   }

   public int countString(String searchString, String origString) {
        int counter = 0;
        for (int i = 0; i < origString.length(); i++){
            int end = i + searchString.length();
            if (end > origString.length()){
                end = origString.length();
            } 
            if (searchString.equals(origString.subSequence(i, end))){
                System.out.println(origString.subSequence(i, end));
                counter++;
                
            }
            
        }
       return counter;
   }

   public String removeString(String searchString, String origString) {
   
    while (origString.indexOf(searchString)!=-1){
        origString=origString.substring(0, origString.indexOf(searchString))+origString.substring(origString.indexOf(searchString)+searchString.length());
    }  
    return origString;
   }



   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
       String x = "";
    if (fromNum<=toNum){
        for (int i = fromNum; i <= toNum; i++){
        if (i == toNum){
            x+=i+"\n";
        } else {
            x+=i+", ";
        }
       
    }
    } else {
        for (int i = fromNum; i >= toNum; i--){
            if (i == toNum){
            x+=i+"\n";
        } else {
            x+=i+", ";
        }
        }
    }
    System.out.println(x);
   }



   public boolean isPalindrome(String myString) {
        String word = myString.replaceAll(" ", "");
        String newString = "";
        for (int i = 0; i < word.length(); i++){
	        String character = word.substring(i, i + 1);
	        newString = character + newString;
        }
        if (word.equals(newString)){
		    return true;
        } else {
	        return false;
        }
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
        String printed = "[";
    int count = 0;
    if (num <= 0){
        System.out.println("[]\n");
    } else {
    while (count < num-1){
        count++;
        printed+=toPrint+" ";
    }
    printed+=toPrint+"]\n";  
    System.out.println(printed);
        
   }
}

   
}
