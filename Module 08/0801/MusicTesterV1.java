public class MusicTesterV1 {
    public static void main (String[] args) {
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
        findTitle(songs, "505");

        System.out.println("");
        findArtist(songs, "Dua Lipa");

        System.out.println("");
        findYear(songs, 2014);
    }

    public static void findTitle(Music[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getTitle().compareTo(toFind) == 0)
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
    

    public static void findArtist(Music[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getArtist().compareTo(toFind) == 0)
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

    public static void findYear(Music[] r, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getYear() == toFind)
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


    public static void printsongs(Music[] r)
    {
        System.out.println("Song                      Year   Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}
