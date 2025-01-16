public class TrieNode {

    TrieNode[] children;


    boolean wordEnd;

    public TrieNode() {
        wordEnd = false;
        children = new TrieNode[26];
    }

}
