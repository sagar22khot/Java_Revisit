public class Strings {
    public static void main(String[] args) {

        // Basic String Operations
        String name = "Sagar";
        String mname = name + " Khot";
        mname = "Mr. " + mname;
        System.out.println(mname);

        // String plus Numbers
        String stringToNum1 = "Num " + 9;
        String stringToNum2 = 9 + " Num";
        System.out.println(stringToNum1 + " " + stringToNum2);

        // Advanced String Operations
        System.out.println(mname.charAt(0));
        System.out.println(mname.contains("Sagar"));
        System.out.println(mname.indexOf("Sagar"));
        System.out.println(mname.length());

        System.out.println("Dog Cat " + ("dog").equals("cat"));
        System.out.println("Dog Cat " + ("dog").equalsIgnoreCase("Dog"));
        System.out.println(mname.compareTo("Mr"));
        System.out.println(mname.replace("Sagar", "Hero"));
        System.out.println(mname.substring(0, 5));

        System.out.println("Enhanced for loop: ");
        for (String x : mname.split(" ")) {
            System.out.println(x);
        }
        // search for trim, to upper case, to lower case

        // Use of String Builder for many string changes
        System.out.println();
        StringBuilder sb = new StringBuilder("I am a string builder");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" yeah!");
        System.out.println(sb.insert(7, "Big "));
        System.out.println(sb.replace(7, 10, "wig"));
        System.out.println(sb.substring(6, 10));
        System.out.println(sb.delete(6, 10));
        System.out.println(sb.charAt(8));
        System.out.println(sb.indexOf("yeah"));
    }
}
