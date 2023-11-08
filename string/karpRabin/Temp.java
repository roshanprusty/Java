package com.string.karpRabin;

public class Temp {
    //suppose there is two string: StringA: "Roshan", StringB="Prusty Roshan"
    //karp-Robin used to check whether StringA is there or not in StringB
    //O(n+m)

    private final int PRIME = 101;

    private double calculateHash(String str){
        double hash =0;
        for (int i = 0; i < str.length(); i++) {
            hash= hash + str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength-1);
        return newHash;
    }
    public void search(String text, String pattern){
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));
        for (int i = 0; i <=text.length()-patternLength; i++) {
            if(textHash==patternHash){
                if(text.substring(i, i+patternLength).equals(pattern)){
                    System.out.println("Pattern found at index "+i);
                }
            }
            if(i<text.length()-patternLength){
                textHash=updateHash(textHash, text.charAt(i), text.charAt(i+patternLength), patternLength);
            }
        }
    }
    public void find(String text, String pattern){
        int patternLen = pattern.length();
        for (int i = 0; i <=text.length()-pattern.length(); i++) {
            if(text.substring(i,i+patternLen).equals(pattern)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Temp KarpRobin = new Temp();
        KarpRobin.search("PRUSTYKishorRoshan", "Roshan");
        KarpRobin.find("PRUSTYKishorRoshan", "Roshan");
    }
}
