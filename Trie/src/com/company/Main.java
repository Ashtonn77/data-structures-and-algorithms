package com.company;

public class Main {

    public static void main(String[] args) {
        
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startaWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
        
    }
    
}
