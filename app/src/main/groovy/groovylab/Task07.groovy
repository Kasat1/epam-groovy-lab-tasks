/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
        if(s.length()==0) return"";
        List words = s.split(" ") 
        def res = []
        for (def i in words){
          if (i.length() <= 2){
            if(i.length() <= 1){res << (int) i[0]}
            else {res << (int) i[0]+i[1]}
          }
          else{
            res << (int) i[0] + i[-1] + i[2..-2] + i[1]
          }
        }
        return res.join(" ")
          // for (int i=0;i<words.count;i++){
          //     return  (int) words[i][0]+words[i][-1]+words[i][2,3,1]}
        //return words[0][0]
    }  
    static void main(String[] args) {
      println Task07.encryptThis("Hi Peter PArker")
}
}
