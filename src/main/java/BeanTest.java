import daos.DaoFactory;
import models.Album;
import models.Author;
import models.Product;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        ArrayList<Quote> quotesArr = new ArrayList<>();

        Album rodsHits = new Album();
        rodsHits.setId(1);
        rodsHits.setArtist("Royksopp");
        rodsHits.setName("Melody A.M.");
        rodsHits.setReleaseDate(2001);
        rodsHits.setSales(10000);
        rodsHits.setGenre("electronica");

        System.out.println("rodsHits: " + rodsHits.getArtist()
        + " " + rodsHits.getName() + " " + rodsHits.getReleaseDate() + " " +
                rodsHits.getSales() + " " + rodsHits.getGenre()
        );

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("John");
        author1.setLastName("Johnson");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Jim");
        author2.setLastName("James");

        Author author3 = new Author();
        author3.setId(3);
        author3.setFirstName("Ray");
        author3.setLastName("Finkle");

        System.out.println("author 1: " + author1.getId() + " " +
        author1.getFirstName() + " " + author1.getLastName());

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setContent("Here is a quote.");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setAuthor(author2);
        quote2.setContent("Here is a second quote.");

        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setAuthor(author3);
        quote3.setContent("Here is a third quote.");

        System.out.println(
                "quote 1: " + quote1.getId() + " " + quote1.getAuthor().getFirstName() + " " +
                        quote1.getAuthor().getLastName() + " "
                + quote1.getContent()
        );
        quotesArr.add(quote1);
        quotesArr.add(quote2);
        quotesArr.add(quote3);
        for (Quote quote: quotesArr) {
            System.out.println("content: " + quote.getContent() + " " +
                    "author: " + quote.getAuthor().getFirstName() + " " +
                    quote.getAuthor().getLastName());
        }

        DaoFactory.getProductsDao().all();
        DaoFactory.getProductsDao().insert(new Product()); // keeps using an existing
    }
}
