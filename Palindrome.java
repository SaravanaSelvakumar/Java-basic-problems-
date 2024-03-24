class Palindrome {
    public static void main(String[] args) {
        String name ="A man a plan a canal Panama";
        String reName =name.replaceAll("\\s+", "").toLowerCase();  //in this step we take all the spaces using regex or we can use this (" ", "") instead of this ("\\s+", "") to remove space 
        String reverse ="";                                       // Using the help of loop we are storing it in reverse order in the String reverse variable
        for (int i=reName.length()-1;i>=0;i--){
            reverse=reverse+reName.charAt(i);
        }
        if (reName.equals(reverse)){                                  
            System.out.println("It's a palindrome");                       //     OUTPUT
        }else{
            System.out.println("No It's not a palindrome");          //      It's a palindrome
        }                                                           //    name = "A man a plan a canal Panama";
        System.out.println(reverse);                               //  reverse = "amanaplanacanalpanama";
    }
}
