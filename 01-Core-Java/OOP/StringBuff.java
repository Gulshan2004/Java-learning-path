public class StringBuff {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Gulshan");
        //System.out.println(sb.capacity()); // Gives 16 extra Spaces 
       // System.out.println(sb.length()); //gives the length of the string
       
       //sb.append(" kumar");
       //System.out.println(sb);

       //String str =sb; //Type mismatch error cuz we cannot convert directly convert a string buffer to string 
       // TO convert it we use the toString() method
       //String str =  sb.toString();
       //System.out.println(str);

       //sb.deleteCharAt(2); To delete a character at a particular index
       //System.out.println(sb);
       
       //sb.insert(0,"java "); //this will insert java at index 0
       //System.out.println(sb);

       //sb.setLength(14); this will set the length  String can have
       System.out.println(sb);

       //NOTE: THESE ARE SOME/NOT ALL  ATTRIBUTES OF STRING BUFFER THAT CAN BE USED WITH STRINNG BUFFER
    } 
}
