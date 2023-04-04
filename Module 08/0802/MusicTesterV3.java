public class MusicTesterV3 {
    public static void main (String[] args) {
        int titleSort;
        Music[] artistSort = new Music[10];

        Music[] songs = new Music[10];
        songs[0] = new Music("Tourner Dans Le Vide", 2014, "Indila");
        songs[1] = new Music("One Kiss", 2018, "Dua Lipa");
        songs[2] = new Music("The Nights", 2014, "Avicii");
        songs[3] = new Music("Body", 2021, "Russ Millions");
        songs[4] = new Music("S.T.A.Y.", 2014, "Hans Zimmer");
        songs[5] = new Music("505", 2007, "Arctic Monkeys");
        songs[6] = new Music("Open It Up", 2018, "Migos");
        songs[7] = new Music("Blinding Lights", 2020, "The Weeknd");
        songs[8] = new Music("Levitating", 2020, "Dua Lipa");
        songs[9] = new Music("Never Gonna Give You Up", 1987, "Rick Astley");



        printsongs(songs);
        
        System.out.println("");
        System.out.println("Searching for 505");
        sortMusicByTitle(songs, 1);
        titleSort = binarySearchTitle(songs, "505");
        if(titleSort != -1)
            System.out.println("Found: \n" + songs[titleSort]);
        else
            System.out.println("Not found. " );

        System.out.println("");
        System.out.println("Searching for Dua Lipa");
        artistSort = insertionArtist(songs, 1);
        binarySearchArtist(artistSort, "Dua Lipa");

        System.out.println("");
        System.out.println("Searching for songs in 2014");
        insertionYear(songs, 1);
        binarySearchYear(songs, 2014);
        
        
    }

    
    public static void insertionYear (Music[] source, int choice)
    {
        int i;
        int k;
        int posMax;
        Music year;
    if (choice == 1) {
        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( source[ k ].getYear() > source[ posMax ].getYear() )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            year = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = year;
        }
    }
        else if (choice == 2) {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( source[ k ].getYear() < source[ posMax ].getYear() )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            year = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = year;
            
        }
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : source)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        }
    }

    public static Music[] insertionArtist(Music[] source, int choice1or2)
    {
        Music[] dest = new Music[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            if (choice1or2 == 1) {
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getArtist().compareTo( dest[k-1].getArtist() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }
            else if (choice1or2 == 2) {
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getArtist().compareTo( dest[k-1].getArtist() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(Music h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        return dest;
    }
    public static void sortMusicByTitle(Music[] titles, int order) {
        for (int i = 0; i < titles.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < titles.length; j++) {
                if (order == 1 && titles[j].getTitle().compareToIgnoreCase(titles[minIndex].getTitle()) < 0) {
                    minIndex = j;
                } else if (order == 2 && titles[j].getTitle().compareToIgnoreCase(titles[minIndex].getTitle()) > 0) {
                    minIndex = j;
                }
            }
            Music temp = titles[minIndex];
            titles[minIndex] = titles[i];
            titles[i] = temp;
        }
    }

    public static int binarySearchTitle(Music[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

 
public static void binarySearchArtist(Music[] r, String toFind )
{
    int high = r.length;
    int low = -1;
    int probe;

    while( high - low > 1 )
    {
        probe = ( high + low ) / 2;

        if(r[probe].getArtist().compareTo(toFind) > 0)
            high = probe;
        else
        {
            low = probe;
            if( r[probe].getArtist().compareTo(toFind) == 0)
            {
                break;
            }
        }
    }
    
    if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
    {
        linearPrintArt(r, low, toFind);
    }
    else
        System.out.println("NOT found: " + toFind);
}

public static void linearPrintArt(Music[] r, int low, String toFind)
{
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
    {
        start = i;
        i--;
    }
    // find ending point of matches
    i = low + 1;
    while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
    {
        end = i;
        i++;
    }
    // now print out the matches
    for(i = start; i <= end; i++)
        System.out.println(r[i]);
}


public static void binarySearchYear(Music[] r, int toFind )
{
    int high = r.length;
    int low = -1;
    int probe;

    while( high - low > 1 )
    {
        probe = ( high + low ) / 2;

        if(r[probe].getYear() > toFind)
            high = probe;
        else
        {
            low = probe;
            if( r[probe].getYear() == toFind)
            {
                break;
            }
        }
    }
    
    if( (low >= 0) && (r[low].getYear() == toFind ))
    {
        linearPrintYear(r, low, toFind);
    }
    else
        System.out.println("NOT found: " + toFind);
}

public static void linearPrintYear(Music[] r, int low, int toFind)
{
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while((i >= 0) && (r[i].getYear() == toFind))
    {
        start = i;
        i--;
    }
    // find ending point of matches
    i = low + 1;
    while((i < r.length) && (r[i].getYear() == toFind))
    {
        end = i;
        i++;
    }
    // now print out the matches
    for(i = start; i <= end; i++)
        System.out.println(r[i]);
}


    public static void printsongs(Music[] r)
    {
        System.out.println("Song                      Year   Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}
