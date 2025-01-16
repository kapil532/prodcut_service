import java.util.Arrays;
import java.util.List;

public class Tries
{


    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> arr = Arrays.asList(
                "and", "ant", "do", "geek", "dad", "ball");
        for (String s : arr) {
            insertKey(root, s);
        }
    }


    static  void insertKey(TrieNode root, String key)
    {
    TrieNode current = root;
     for(char c : key.toCharArray())
     {
         System.out.println("current "+(c-'a'));
        if(current.children[c-'a'] == null)
        {
            System.out.println("====null==");
             current.children[c-'a'] = new TrieNode();
        }
         System.out.println("====else==");
        current = current.children[c-'a'];

     }
        System.out.println("====End==");
        current.wordEnd = true;
    }
}
