class HelloWorld {
    public static void main(String[] args) {
        
        char c = 'c';
        String str = "c is the c of c is the c in c";
        int occurence = 0;
        
        for (int i=0; i < str.length(); i++)
        {
            if (Character.toUpperCase(c) == Character.toUpperCase(str.charAt(i)))
            {
                occurence++;
            }
        }
        
        System.out.println(c + " occurs " + occurence + " times in " + str);
    }
}
