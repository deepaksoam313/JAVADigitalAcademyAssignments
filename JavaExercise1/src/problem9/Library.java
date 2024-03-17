package problem9;
import java.util.*;

class LibraryItem {
    private String id;
    private String title;
    private int publicationYear;

    public LibraryItem(String id, String title, int publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Publication Year: " + publicationYear;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String id, String title, String author, int publicationYear) {
        super(id, title, publicationYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}

class CD extends LibraryItem {
    private String artist;
    private int numberOfTracks;

    public CD(String id, String title, String artist, int numberOfTracks, int publicationYear) {
        super(id, title, publicationYear);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Number of Tracks: " + numberOfTracks;
    }
}

public class Library {
    private Map<String, LibraryItem> items;

    public Library() {
        items = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
    }

    public LibraryItem removeItem(String id) {
        return items.remove(id);
    }

    public LibraryItem findItem(String id) {
        return items.get(id);
    }

    public List<LibraryItem> getAllItems() {
        return new ArrayList<>(items.values());
    }

    public List<LibraryItem> getItemsByYear(int year) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items.values()) {
            if (item.getPublicationYear() == year) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (LibraryItem item : items.values()) {
            if (item instanceof Book && ((Book) item).getAuthor().equals(author)) {
                result.add((Book) item);
            }
        }
        return result;
    }

    public List<CD> getCDsByArtist(String artist) {
        List<CD> result = new ArrayList<>();
        for (LibraryItem item : items.values()) {
            if (item instanceof CD && ((CD) item).getArtist().equals(artist)) {
                result.add((CD) item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("B1", "2 states", "Chetan Bhagat", 2020);
        Book book2 = new Book("B2", "Peace within you", "Deepak Soam", 2019);
        CD cd1 = new CD("C1", "Discovery of India", "JL Nehru", 12, 2000);
        CD cd2 = new CD("C2", "Godan", "Premchand", 10, 1995);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(cd1);
        library.addItem(cd2);

        // Example usage
        System.out.println("Find item with ID B2: " + library.findItem("B2"));
        System.out.println("All items:");
        library.getAllItems().forEach(System.out::println);
        System.out.println("Books published in 2019:");
        library.getItemsByYear(2019).forEach(System.out::println);
        System.out.println("CDs by Premchand:");
        library.getCDsByArtist("Premchand").forEach(System.out::println);
    }
}
