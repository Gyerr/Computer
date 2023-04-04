import javax.xml.stream.events.Namespace;

public class ContactTester {
    public static void main(String[] args) {
        int nameSort;
        Contact[] relationSort = new Contact[10];
        
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact("John Doe", "friend", "Jan 1", "123-456-7890", "john.doe@example.com");
        contacts[1] = new Contact("Jane Smith", "colleague", "Feb 14", "234-567-8901", "jane.smith@example.com");
        contacts[2] = new Contact("Bob Johnson", "father", "Mar 23", "345-678-9012", "bob.johnson@example.com");
        contacts[3] = new Contact("Alice James", "sister", "Apr 30", "456-789-0123", "alice.williams@example.com");
        contacts[4] = new Contact("David Brown", "friend", "May 5", "567-890-1234", "david.brown@example.com");
        contacts[5] = new Contact("Sarah Davis", "colleague", "Jun 12", "678-901-2345", "sarah.davis@example.com");
        contacts[6] = new Contact("Tom Wilson", "cousin", "Jul 19", "789-012-3456", "tom.wilson@example.com");
        contacts[7] = new Contact("Mary Lee", "mother", "Aug 27", "890-123-4567", "mary.lee@example.com");
        contacts[8] = new Contact("Mark Miller", "colleague", "Sep 14", "901-234-5678", "mark.miller@example.com");
        contacts[9] = new Contact("Emily Taylor", "aunt", "Oct 31", "012-345-6789", "emily.taylor@example.com");

        // Print out the original array
        printcontacts(contacts);

        // Test searching for a name
        System.out.println("");
        System.out.println("Searching for Mark Miller & Lionel Messi");
        sortContactsByName(contacts, 1);
        nameSort = binarySearchName(contacts, "John Doe");
        if(nameSort != -1)
            System.out.println("Found: \n" + contacts[nameSort]);
        else
            System.out.println("Not found. " );
        nameSort = binarySearchName(contacts, "Leo Messi");
        if(nameSort != -1)
            System.out.println("Found: \n" + contacts[nameSort]);
        else
            System.out.println("Not found. " );
        

        // Test searching for a relationship
        System.out.println("");
        System.out.println("Searching for aunts & uncles");
        selectionRelation(contacts);
        binarySearchRelation(contacts, "aunt");
        binarySearchRelation(contacts, "uncle");

        // Test searching for birthdays in a specific month
        System.out.println("");
        System.out.println("Searching for birthdays (Mar and Dem)");
        searchByMonth(contacts, "Mar");
        searchByMonth(contacts, "Dem");

        // Test searching for Number
        System.out.println("");
        System.out.println("Searching for Numbers");
        findNumber(contacts, "678-901-2345");
        findNumber(contacts, "111-113-1982");

        //Test searching for Email
        System.out.println("");
        System.out.println("Searching for Emails");
        findEmail(contacts, "sarah.davis@example.com");
        findEmail(contacts, "Johndoe@gmail.com");
    }
    public static int binarySearchName(Contact[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    
    public static void binarySearchRelation(Contact[] r, String toFind )
    {
    int high = r.length;
    int low = -1;
    int probe;

    while( high - low > 1 )
    {
        probe = ( high + low ) / 2;

        if(r[probe].getRelation().compareTo(toFind) > 0)
            high = probe;
        else
        {
            low = probe;
            if( r[probe].getRelation().compareTo(toFind) == 0)
            {
                break;
            }
        }
    }
    
    if( (low >= 0) && (r[low].getRelation().compareTo(toFind) == 0 ))
    {
        linearPrintRelation(r, low, toFind);
    }
    else
        System.out.println("NOT found: " + toFind);
    }
    public static void linearPrintRelation(Contact[] r, int low, String toFind)
{
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0))
    {
        start = i;
        i--;
    }
    // find ending point of matches
    i = low + 1;
    while((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0))
    {
        end = i;
        i++;
    }
    // now print out the matches
    for(i = start; i <= end; i++)
        System.out.println(r[i]);
}
public static void searchByMonth(Contact[] contacts, String month) {
    boolean found = false;
    for (Contact contact : contacts) {
        if (contact.getBirthday().contains(month)) {
            if (!found) {
                System.out.println("Contacts with birthdays in " + month + ":");
                found = true;
            }
            System.out.println(contact.toString());
        }
    }
    if (!found) {
        System.out.println("No contacts found with birthdays in " + month);
    }
}
public static void findEmail(Contact[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getEmailAddress().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }
    public static void findNumber(Contact[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getPhoneNumber().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }


    public static void sortContactsByName(Contact[] titles, int order) {
        for (int i = 0; i < titles.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < titles.length; j++) {
                if (order == 1 && titles[j].getName().compareToIgnoreCase(titles[minIndex].getName()) < 0) {
                    minIndex = j;
                } else if (order == 2 && titles[j].getName().compareToIgnoreCase(titles[minIndex].getName()) > 0) {
                    minIndex = j;
                }
            }
            Contact temp = titles[minIndex];
            titles[minIndex] = titles[i];
            titles[i] = temp;
        }
    }
    
    public static void selectionRelation (Contact[] source)
    {
        int i;
        int k;
        int posMax;
        Contact temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getRelation().compareTo(source[posMax].getRelation()) > 0 )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            // System.out.println("\nPass # " + i);
            //for(Assignment a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getLocation() );
        }
    }
    //public static void sortContactsbyRelation(Contact[] source, int order) {
    //    for (int i = 0; i < source.length - 1; i++) {
    //        int minIndex = i;
    //        for (int j = i + 1; j < source.length; j++) {
    //            if (order == 1 && source[j].getRelation().compareToIgnoreCase(source[minIndex].getRelation()) < 0) {
    //                minIndex = j;
    //            } else if (order == 2 && source[j].getRelation().compareToIgnoreCase(source[minIndex].getRelation()) > 0) {
    //                minIndex = j;
    //            }
    //        }
    //        Contact temp = source[minIndex];
    //        source[minIndex] = source[i];
    //        source[i] = temp;
    //    }
    //}
    
    public static void printcontacts(Contact[] r)
    {
        System.out.println("Name                Relation       Birthday    Phone Number               Email");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}